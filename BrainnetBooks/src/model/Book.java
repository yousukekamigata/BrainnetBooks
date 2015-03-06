package model;



public class Book {

	public Book(String isbn, String bookName) {
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
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public short getPrice() {
		return price;
	}
	public void setPrice(short price) {
		this.price = price;
	}
	public java.sql.Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(java.sql.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public short getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(short categoryId) {
		this.categoryId = categoryId;
	}
	public java.sql.Timestamp getModifyDatetime() {
		return modifyDatetime;
	}
	public void setModifyDatetime(java.sql.Timestamp modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}
	public java.sql.Timestamp getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(java.sql.Timestamp createDatetime) {
		this.createDatetime = createDatetime;
	}
}