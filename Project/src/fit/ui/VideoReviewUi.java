package fit.ui;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import fit.model.Video;
import fit.model.VideoReview;
import fit.model.dao.VideoReviewDao;
import fit.model.dao.VideoReviewDaoImpl;
import fit.util.SsafitUtil;

public class VideoReviewUi {
	private VideoReviewDao videoReviewDao = VideoReviewDaoImpl.getInstance();
	private int videoNo = 0;
	private static VideoReviewUi instance;

	// 기본 생성자
	public VideoReviewUi() {
	}

	// 파라미터 생성자
	private VideoReviewUi(int videoNo) {
		this.videoNo = videoNo;
	}

	// 싱글턴 패턴 객체 생성
	public static VideoReviewUi getinstance(int videoNo) {
		instance = new VideoReviewUi(videoNo);
		return instance;
	}

	public void service() {
		VideoReviewDao vrd = VideoReviewDaoImpl.getInstance();
		SsafitUtil.printLine();
		try {
			SsafitUtil.printLine("전체 " + vrd.selectReview(videoNo).size() + " 개");
			listReview();
		} catch (NullPointerException e) {
			System.out.println("리뷰가 없습니다. 등록해주세요.");
			registReview();
		}
	}

	private void listReview() {

		try {
			VideoReviewDao vrd = VideoReviewDaoImpl.getInstance();
			List<VideoReview> rvList = vrd.selectReview(videoNo);
			SsafitUtil.printLine();
			for (int i = 0; i < rvList.size(); i++) {
				SsafitUtil.printLine(rvList.get(i).toString());
			}
			SsafitUtil.printLine();
			SsafitUtil.printLine("1. 리뷰등록");
			SsafitUtil.printLine("0. 이전으로");
			SsafitUtil.printLine();
			int menu = SsafitUtil.inputInt("메뉴를 선택하세요 : ");
			if (menu == 1) {
				registReview();
			} else {
				VideoUi v = VideoUi.getInstance();
				v.service();
			}
		} catch (NullPointerException e) {
			registReview();
		}
	}

	private void registReview() {
		String str = SsafitUtil.input("닉네임을 입력하세요 : ");
		String str2 = SsafitUtil.input("내용을 입력하세요 : ");
		VideoReviewDaoImpl vrdi = VideoReviewDaoImpl.getInstance();

		VideoReview vr = new VideoReview();
		vr.setReviewNo(2);
		vr.setVideoNo(videoNo);
		vr.setNickName(str);
		vr.setContent(str2);
		
		vrdi.insertReview(vr);
		System.out.println("리뷰 등록이 완료되었습니다!");
		VideoUi v = VideoUi.getInstance();
		service();
		
		
	}

}
