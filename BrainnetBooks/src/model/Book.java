package model;

import java.sql.Date;
import java.sql.Timestamp;

public class Book {
	public Book(String isbn, String bookName, String authorName,
			String publisherName, short price, Date releaseDate,
			short categoryId, Timestamp modifyDatetime,
			Timestamp createDatetime) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.price = price;
		this.releaseDate = releaseDate;
		this.categoryId = categoryId;
		this.modifyDatetime = modifyDatetime;
		this.createDatetime = createDatetime;
	}
	private String isbn;
	private String bookName;
	private String authorName;
	private String publisherName;
	private short price;
	private java.sql.Date releaseDate;
	private short categoryId;
	private java.sql.Timestamp modifyDatetime;
	private java.sql.Timestamp createDatetime;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBook_name() {
		return bookName;
	}
	public void setBook_name(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor_name() {
		return authorName;
	}
	public void setAuthor_name(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher_name() {
		return publisherName;
	}
	public void setPublisher_name(String publisherName) {
		this.publisherName = publisherName;
	}
	public short getPrice() {
		return price;
	}
	public void setPrice(short price) {
		this.price = price;
	}
	public java.sql.Date getRelease_date() {
		return releaseDate;
	}
	public void setRelease_date(java.sql.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public short getCategory_id() {
		return categoryId;
	}
	public void setCategory_id(short categoryId) {
		this.categoryId = categoryId;
	}
	public java.sql.Timestamp getModify_datetime() {
		return modifyDatetime;
	}
	public void setModify_datetime(java.sql.Timestamp modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}
	public java.sql.Timestamp getCreate_datetime() {
		return createDatetime;
	}
	public void setCreate_datetime(java.sql.Timestamp createDatetime) {
		this.createDatetime = createDatetime;
	}
}