package fit.model.dao;

import java.util.ArrayList;
import java.util.List;

import fit.model.Video;

public class VideoDaoImpl implements VideoDao {
	private List<Video> list = new ArrayList<>();

	// 싱글턴패턴을 위한 객체 생성
	private static VideoDao instance = new VideoDaoImpl();

	// 외부에서 생성 못 하도록 private
	private VideoDaoImpl() {

	}

	// 외부에서 객체 사용할 수 있도록 getter
	public static VideoDao getInstance() {
		return instance;
	}

	@Override
	public List<Video> selectVideo() {
		return list; // 이거 없어도 됨
	}

	@Override
	public Video selectVideoByNo(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no)
				return list.get(i);
		}
		return null;
	}

}
