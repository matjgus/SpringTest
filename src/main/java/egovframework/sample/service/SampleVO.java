package egovframework.sample.service;

import java.sql.Date;

public class SampleVO {
	//계층 간 데이터 교환을 위해 사용
	private String id;
	private String title;
	private String regUser;
	private String content;
	private Date regDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SampleVO[id=" + id +", title=" + title + ", regUser=" + regUser + ", content=" + content + ", regDate=" + regDate + "]";
	}
	
	
}
