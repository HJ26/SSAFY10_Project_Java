package fit.model.dao;

import java.util.ArrayList;
import java.util.List;

import fit.model.Video;

public interface VideoDao {
	List<Video> selectVideo();
	Video selectVideoByNo(int no);
}
