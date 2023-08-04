package fit.model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import fit.model.Video;

public class VideoDaoImpl implements VideoDao {
	private List<Video> list = new ArrayList<>();

	// 싱글턴패턴을 위한 객체 생성
	private static VideoDaoImpl instance = new VideoDaoImpl();

	// 외부에서 생성 못 하도록 private
	private VideoDaoImpl() {
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
		list = arrList;

	}

	// 외부에서 객체 사용할 수 있도록 getter
	public static VideoDaoImpl getInstance() {
		return instance;
	}

	// 영화 리스트 출력
	@Override
	public List<Video> selectVideo() {
		return list;
	}

	// 해당하는 영화 번호의 영화 정보 출력
	@Override
	public Video selectVideoByNo(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no)
				return list.get(i);
		}
		return null;
	}

}
