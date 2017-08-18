package com.library.domain;

public class Books {
	
	private String author;
	private int ISDN;
	private String name;
	
	public Books(String author, int iSDN, String name) {
		super();
		this.author = author;
		ISDN = iSDN;
		this.name = name;
	}
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getISDN() {
		return ISDN;
	}
	public void setISDN(int iSDN) {
		ISDN = iSDN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Books [author=" + author + ", ISDN=" + ISDN + ", name=" + name + "]";
	}
}

