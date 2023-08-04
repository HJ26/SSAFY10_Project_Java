
public class VideoReviewUi {
	private VideoReviewDao videoReviewDao = new VideoReviewDao();
	private int videoNo = 0;
	private static VideoReviewUi instance = new VideoReviewUi(videoNo);
	
	private VideoReviewUi(int videoNo) {
		this.videoNo = videoNo;
	}
	
	public static VideoReviewUi getinstance(int videoNo){
		return instance;
	}
	
	public void service() {
		
	}
	private void listReview() {
		
	}
	private void registReview() {
		
	}
	
}
