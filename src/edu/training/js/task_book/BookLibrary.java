package edu.training.js.task_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookLibrary {
	
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
    	
        books.add(book);
        
    }
    
    public List<Book> showListBooksAuthor(String author) {
    	
        List<Book> bookAuthor = new ArrayList<>();
        
        for (int i = 0; i < books.size(); i++) {
        	
            if (books.get(i).getBookAuthor().equals(author)) {
            	
                bookAuthor.add(books.get(i));
                
            }
            
        }
        return bookAuthor;
        
    }

    public List<Book> showListBooksPublishing(String publishing) {
    	
        List<Book> bookPublishing = new ArrayList<>();
        
        for (int i = 0; i < books.size(); i++) {
        	
            if (books.get(i).getBookPublishingHouse() == publishing) {
            	
                bookPublishing.add(books.get(i));
                
            }
            
        }
        return bookPublishing;
        
    }

    public List<Book> showListBooksYears(int year) {
    	
        List<Book> bookYears = new ArrayList<>();
        
        for (int i = 0; i < books.size(); i++) {
        	
            if (books.get(i).getBookYearPublishing() > year){
            	
                bookYears.add(books.get(i));
                
            }
            
        }
        return bookYears;
    }

	@Override
	public String toString() {
		return "BookLibrary [books=" + books + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLibrary other = (BookLibrary) obj;
		return Objects.equals(books, other.books);
	}

    
}
