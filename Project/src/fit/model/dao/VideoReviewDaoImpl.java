package fit.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import fit.model.VideoReview;

public class VideoReviewDaoImpl implements VideoReviewDao {

	private static int reviewNo;
	private Map<Integer, List<VideoReview>> videoReviewDb = new HashMap<Integer, List<VideoReview>>();
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();

	private VideoReviewDaoImpl() {
	}

	public static VideoReviewDaoImpl getInstance() {
		return instance;
	}

	@Override
	public int insertReview(VideoReview videoReview) {
		return 0;
//		videoReviewDb.put(reviewNo++, videoReview);
	}

	@Override
	// 입력받은 영화번호의 영화 리뷰 불러오기
	public List<VideoReview> selectReview(int videoNo){
		return null;
//		videoReviewDb.
		
	}

}
