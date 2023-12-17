package edu.training.js.task_book;

import java.util.Objects;

public class Book {
	
    private int id;
    private String bookName;
    private String bookAuthor;
    private String bookPublishingHouse;
    private int bookYearPublishing;
    private int bookPages;
    private int bookPrice;
    private String bookBinding;
    
	public Book() {
		
	}

	public Book(int id, String bookName, String bookAuthor, String bookPublishingHouse, int bookYearPublishing,
			int bookPages, int bookPrice, String bookBinding) {
		
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublishingHouse = bookPublishingHouse;
		this.bookYearPublishing = bookYearPublishing;
		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
		this.bookBinding = bookBinding;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublishingHouse() {
		return bookPublishingHouse;
	}

	public void setBookPublishingHouse(String bookPublishingHouse) {
		this.bookPublishingHouse = bookPublishingHouse;
	}

	public int getBookYearPublishing() {
		return bookYearPublishing;
	}

	public void setBookYearPublishing(int bookYearPublishing) {
		this.bookYearPublishing = bookYearPublishing;
	}

	public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookBinding() {
		return bookBinding;
	}

	public void setBookBinding(String bookBinding) {
		this.bookBinding = bookBinding;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublishingHouse="
				+ bookPublishingHouse + ", bookYearPublishing=" + bookYearPublishing + ", bookPages=" + bookPages
				+ ", bookPrice=" + bookPrice + ", bookBinding=" + bookBinding + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookBinding, bookName, bookPages, bookPrice, bookPublishingHouse,
				bookYearPublishing, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookBinding, other.bookBinding)
				&& Objects.equals(bookName, other.bookName) && bookPages == other.bookPages
				&& bookPrice == other.bookPrice && bookPublishingHouse == other.bookPublishingHouse
				&& bookYearPublishing == other.bookYearPublishing && id == other.id;
	}

}
