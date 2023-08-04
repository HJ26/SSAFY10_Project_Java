package fit.ui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import fit.model.Video;
import fit.model.dao.VideoDao;
import fit.model.dao.VideoDaoImpl;
import fit.util.SsafitUtil;

public class VideoUi {

	
	// 멤버변수 선언
	private VideoDao videoDao = VideoDaoImpl.getInstance();
	
	// 싱글턴패턴 객체 생성
	private static VideoUi instance = new VideoUi();

	// 외부에서 생성 못 하도록 private로 기본 생성자 생성
	private VideoUi() {
		List<Video> arrList = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/video.json")));
			StringBuilder sb = new StringBuilder();
			String str = null;
			while((str = br.readLine()) != null) {
				sb.append(str).append("\n"); // sb에 문자열이 모여있음
			}
			
			Gson gson = new Gson();
			Video[] arr = gson.fromJson(sb.toString(), Video[].class);
			
			
			for (int i =0; i<arr.length; i++) {
				arrList.add(arr[i]);
			}
			
		} catch (Exception e) {
			System.out.println("파일이 없습니다.");
		}
		
		videoDao = (VideoDao) arrList;
	}
	
	public static VideoUi getInstance() {
		
		return instance;
	}

		//		 맨처음 메인화면
	public void service() {
		MainUi mainui = new MainUi();
		int menu;
		SsafitUtil.printLine();
		SsafitUtil.printLine("1. 영상으로 ");
		SsafitUtil.printLine("0. 이전으로 ");
		SsafitUtil.printLine();
		menu = SsafitUtil.inputInt("메뉴를 선택하세요: ");
		
		if(menu == 1) {
			listVideo();
		} else {
			mainui.service();
		}
	}

	private void listVideo() {
		MainUi mainui = new MainUi();
//		 영상목록화면
		int menu;
		SsafitUtil.printLine();
		SsafitUtil.printLine("전체 "+ videoDao.selectVideo().size() + " 개");
		SsafitUtil.printLine();
		for(int i = 0; i < videoDao.selectVideo().size(); i++) {
			System.out.println(videoDao.selectVideo().get(i).toString());
		}
		SsafitUtil.printLine();
		SsafitUtil.printLine("1. 영상으로 ");
		SsafitUtil.printLine("0. 이전으로 ");
		SsafitUtil.printLine();
		menu = SsafitUtil.inputInt("메뉴를 선택하세요: ");
		if(menu == 1) {
			detailVideo();
		} else {
			mainui.service();
		}
	}

	private void detailVideo() {
//		영상상세정보
		int menu2;
		menu2 = SsafitUtil.inputInt("영상 번호를 입력하세요: ");
		SsafitUtil.printLine();
		Video rslt = videoDao.selectVideoByNo(menu2);
		
		VideoReviewUi vru = VideoReviewUi.getinstance(rslt.getNo());
		
		SsafitUtil.printLine("번호 : "+rslt.getNo());
		SsafitUtil.printLine("제목 : "+rslt.getTitle());
		SsafitUtil.printLine("운동 : "+rslt.getPart());
		SsafitUtil.printLine("영상URL : "+rslt.getUrl());
		SsafitUtil.printLine();
		
		vru.service();
		
	}
		
		
		
		
		
		
		
		
		
	}
