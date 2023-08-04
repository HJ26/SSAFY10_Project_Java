package fit.model.dao;

import java.util.List;
import fit.model.VideoReview;

public interface VideoReviewDao {
	int insertReview(VideoReview videoReview);
	List<VideoReview> selectReview(int videoNo);
}
