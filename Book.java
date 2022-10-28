package com.streams;

public class Book {
	private String authorname;
	private String bookname;
	private int noofpages;
	private int price;
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getNoofpages() {
		return noofpages;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String bookname,String authorname,  int noofpages, int price) {
		super();
		this.authorname = authorname;
		this.bookname = bookname;
		this.noofpages = noofpages;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [authorname=" + authorname + ", bookname=" + bookname + ", noofpages=" + noofpages + ", price="
				+ price + "]";
	} 

}
