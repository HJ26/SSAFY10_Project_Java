package fit.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import fit.model.VideoReview;

public class VideoReviewDaoImpl implements VideoReviewDao {

	private static int reviewNo;

	private Map<Integer,List<VideoReview>> videoReviewDb = new HashMap<>() ;

	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();

	private VideoReviewDaoImpl() {
	}

	
	public static VideoReviewDaoImpl getInstance() {
		return instance;
	}


	@Override
	public int insertReview(VideoReview videoReview) {
		List<VideoReview> vrList = new ArrayList<VideoReview>();
		int movieNum = videoReview.getVideoNo();
		if (videoReviewDb.get(movieNum) == null) {
			videoReviewDb.put(movieNum, vrList);
			reviewNo = 1;
		} else reviewNo = videoReviewDb.get(movieNum).size()+1;
		videoReview.setReviewNo(reviewNo);
		videoReviewDb.get(movieNum).add(videoReview);
		return reviewNo++;
	}

	
	// 입력받은 영화번호의 영화 리뷰 불러오기
	@Override
	public List<VideoReview> selectReview(int videoNo){		
		List<VideoReview> rslt = videoReviewDb.get(videoNo);
		return rslt;
		
	}

}
