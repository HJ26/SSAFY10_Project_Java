package fit.model;

public class Video {
	// 멤버 변수
	private int no;
	private String title;
	private String part;
	private String url;

	// 기본생성자
	public Video() {

	}

	// 파라미터 생성자
	public Video(int no, String title, String part, String url) {
		super();
		this.no = no;
		this.title = title;
		this.part = part;
		this.url = url;
	}
	
	// getter&setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	@Override
	public String toString() {
		return "Video [no=" + no + ", title=" + title + ", part=" + part + ", url=" + url + "]";
	}
	

}
