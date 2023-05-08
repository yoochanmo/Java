package com.lec.ex02_board;

public class BoardVO {
	
	private int bno;
	private String subject;
	private String writer;
	private String content;
	private int readcnt;
	private String crtdate;
	
	public BoardVO() {
		this.bno = 0;
		this.subject = null;
		this.writer = null;
		this.content = null;
		this.readcnt = 0;
		this.crtdate = null;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	public String getCrtdate() {
		return crtdate;
	}

	public void setCrtdate(String crtdate) {
		this.crtdate = crtdate;
	}

	@Override
	public String toString() {
		return bno + "\t\t" + subject + "\t\t" + writer + "\t\t" + content;
	}

	
}
