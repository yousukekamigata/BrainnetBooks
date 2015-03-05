package model;

import java.sql.Date;
import java.sql.Timestamp;

public class Book {
	public Book(String isbn, String book_name, String author_name,
			String publisher_name, short price, Date release_date,
			short category_id, Timestamp modify_datetime,
			Timestamp create_datetime) {
		super();
		this.isbn = isbn;
		this.book_name = book_name;
		this.author_name = author_name;
		this.publisher_name = publisher_name;
		this.price = price;
		this.release_date = release_date;
		this.category_id = category_id;
		this.modify_datetime = modify_datetime;
		this.create_datetime = create_datetime;
	}
	private String isbn;
	private String book_name;
	private String author_name;
	private String publisher_name;
	private short price;
	private java.sql.Date release_date;
	private short category_id;
	private java.sql.Timestamp modify_datetime;
	private java.sql.Timestamp create_datetime;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public short getPrice() {
		return price;
	}
	public void setPrice(short price) {
		this.price = price;
	}
	public java.sql.Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(java.sql.Date release_date) {
		this.release_date = release_date;
	}
	public short getCategory_id() {
		return category_id;
	}
	public void setCategory_id(short category_id) {
		this.category_id = category_id;
	}
	public java.sql.Timestamp getModify_datetime() {
		return modify_datetime;
	}
	public void setModify_datetime(java.sql.Timestamp modify_datetime) {
		this.modify_datetime = modify_datetime;
	}
	public java.sql.Timestamp getCreate_datetime() {
		return create_datetime;
	}
	public void setCreate_datetime(java.sql.Timestamp create_datetime) {
		this.create_datetime = create_datetime;
	}
}