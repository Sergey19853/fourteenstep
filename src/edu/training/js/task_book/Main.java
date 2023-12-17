package edu.training.js.task_book;

public class Main {

	public static void main(String[] args) {

        BookLibrary bookLibrary = new BookLibrary();
        
        bookLibrary.addBook(new Book(1, "Книга1", "Автор1", "Издание1", 2020, 100, 300, "Твердый переплет"));
        bookLibrary.addBook(new Book(2, "Книга2", "Автор2", "Издание2", 2021, 110, 400, "Твердый переплет"));
        bookLibrary.addBook(new Book(3, "Книга3", "Автор3", "Издание3", 2022, 120, 500, "Твердый переплет"));
        
        System.out.println(bookLibrary);
        
        System.out.println();
        
        System.out.println(bookLibrary.showListBooksAuthor("Автор1"));
        
        System.out.println();
        
        System.out.println(bookLibrary.showListBooksPublishing("Издание2"));
        
        System.out.println();
        
        System.out.println(bookLibrary.showListBooksYears(2021));

	}

}
