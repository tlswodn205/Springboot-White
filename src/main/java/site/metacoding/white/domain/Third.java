package site.metacoding.white.domain;

public class Third {
	private Integer id;
	private String title;
	private String content;
	
	public Third() {
		System.out.println("디폴트생성가 실행됨.");
	}
	
	@Override
	public String toString() {
		return "Third [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setId실행됨");
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("setTitle실행됨");
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("setContent실행됨");
		this.content = content;
	}
	
}
