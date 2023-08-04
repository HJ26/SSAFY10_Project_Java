package fit.model.dao;

import java.util.ArrayList;
import java.util.List;

import fit.model.Video;

public class VideoDaoImpl implements VideoDao {
	private List<Video> list = new ArrayList<>();

	// 싱글턴패턴을 위한 객체 생성
	private static VideoDaoImpl instance = new VideoDaoImpl();

	// 외부에서 생성 못 하도록 private
	private VideoDaoImpl() {

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
