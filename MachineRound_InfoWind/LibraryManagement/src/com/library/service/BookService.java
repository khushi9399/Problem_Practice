package com.library.service;

import java.util.List;

import com.library.entity.Book;
import com.library.exception.BookNotFoundException;
import com.library.exception.DuplicateBookException;
import com.library.repo.BookRepository;

public class BookService {

	private BookRepository repository = new BookRepository();
	
	 public void addBook(Book book) {
	        if (repository.findByIsbn(book.getIsbnNumber()) != null) {
	            throw new DuplicateBookException("Book with same ISBN already exists");
	        }
	        repository.save(book);
	    }
	
	 public List<Book> getAllBooks(){
		 return repository.findAll();
	 }
	 
	 public Book searchByIsbn(String isbn) {
		 Book book =repository.findByIsbn(isbn);
		 if(book == null)
			 throw new BookNotFoundException("Book Not Found");
		 return book;
	 }
	 
	 public void deleteBook(String isbn) {
		 Book book = repository.findByIsbn(isbn);
		 repository.delete(book);
	 }
}
