package com.percepton.entity;

public class Book 
{
	private Integer bookId;
	private String bookName;
	private String authorName;
	private String publisher;
	private String ISBN;
	private Integer ratring;
	private Float price;
	private String imageURL;
	private Integer hardCopyQty;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Integer getRatring() {
		return ratring;
	}
	public void setRatring(Integer ratring) {
		this.ratring = ratring;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public Integer getHardCopyQty() {
		return hardCopyQty;
	}
	public void setHardCopyQty(Integer hardCopyQty) {
		this.hardCopyQty = hardCopyQty;
	}
	
	
	
}
