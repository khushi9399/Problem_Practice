package com.library.repo;

import java.util.ArrayList;
import java.util.List;

import com.library.entity.Book;

public class BookRepository {

	private List<Book> books = new ArrayList<>();
	
	public void save(Book book) {
		books.add(book);
	}
	
	public List<Book> findAll(){
		return books;
	}
	
	public Book findByIsbn(String isbn) {
		for(Book b : books)
			if(b.getIsbnNumber().equals(isbn)){
				return b;
			}
		return null;
	}
	
	public void delete(Book book) {
		books.remove(book);
	}
}
