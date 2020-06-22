package com.kyondoku.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {}
//	이게 없으면 BoardVO bv2 = new BoardVO(); 빨간줄 뜸
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
	
//	값 넣는거 만드는거 세터(무조건 void)
	public void setTitle(String title) {
		this.title = title;
	}
//	값 얻는거 (게터)
	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	
	public int getWriteId() {
		return writeId;
	}
	
}
