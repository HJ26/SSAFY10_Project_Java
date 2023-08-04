
public interfaceVideoReviewDao {
	int insertReview(VideoReview videoReview);
	List<VideoReview> selectReview(int videoNo);
}
