package com.kyondoku.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {}
//	기본 생성자는 생성자가 없을때 자동으로 생성된다....?
//	이게 없으면 BoardVO bv2 = new BoardVO(); 빨간줄 뜸
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
//		this를 쓴이유는  title...등 전역변수와 지역변수가 같아서!
	}
	
//	값 넣는 방법 1. 생성자 통해서 2. 세터를 통해서 / 값 얻는 방법 1. 게터를 통해서
	
//	상수처럼 값을 안변하게 하는 방법 - 생성자만 있고, 기본생성자 빼고, 세터 빼고.
	
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
