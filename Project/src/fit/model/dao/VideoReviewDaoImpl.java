
public class VideoReviewDaoImpl implements VideoReviewDao{
	
	private static int reviewNo;
	private Map<Integer,List<VideoReview>> videoReviewDb = new HashMap<Integer,List<VideoReview>>() ;
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl;

	private VideoReviewDaoImpl() {
	}
	
	public static VideoReviewDaoImpl getInstance() {
		return instacne;
	}
	
	@Override
	public int insertReview(VideoReview videoReview) {
		videoReviewDb.put(reviewNo++,videoReview);
	}
	
	@Override
	// 입력받은 영화번호의 영화 리뷰 불러오기
	public List<VideoReview> selectReview(int videoNo){
		
		videoReviewDb.
		
	}

}
