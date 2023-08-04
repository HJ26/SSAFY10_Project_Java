package fit.ui;
import fit.model.dao.VideoReviewDao;
import fit.model.dao.VideoReviewDaoImpl;

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
	public static VideoReviewUi getinstance(int videoNo){
		instance = new VideoReviewUi(videoNo);
		return instance;
	}
	
	public void service() {
		
	}
	private void listReview() {
		
	}
	private void registReview() {
		
	}
	
}
