package fit.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fit.model.VideoReview;

public class VideoReviewDaoImpl implements VideoReviewDao{
	
	// Integer : movie 번호
	private static int reviewNo;
	private Map<Integer,List<VideoReview>> videoReviewDb = new HashMap<>() ;
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();

	private VideoReviewDaoImpl() {
	}
	
	public static VideoReviewDaoImpl getInstance() {
		return instance;
	}
	
	// 영화 리뷰에 리뷰 추가하기
	@Override
	public int insertReview(VideoReview videoReview) {
		int movieNum = videoReview.getVideoNo();
		videoReviewDb.get(movieNum).add(videoReview);
		return videoReviewDb.get(movieNum).size();
	}
	
	// 입력받은 영화번호의 영화 리뷰 불러오기
	@Override
	public List<VideoReview> selectReview(int videoNo){
		
		List<VideoReview> rslt = videoReviewDb.get(videoNo);
		return rslt;
	}

}
