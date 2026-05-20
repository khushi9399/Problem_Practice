package com.library.entity;

import java.time.Year;

import com.library.exception.InvalidBookException;

public class Book {

	private String title;
	private String authorName;
	private String isbnNumber;
	private int publicationYear;
	private int availableCopies;
	
	public Book(String title, String authorName, String isbnNumber, int publicationYear, int availableCopies) {
		
		if(title == null || title.trim().isEmpty())
			throw new InvalidBookException("Title cannot be empty");
		
		if(authorName == null || authorName.trim().isEmpty())
			throw new InvalidBookException("Author cannot be empty");
		
		if(isbnNumber == null || isbnNumber.trim().isEmpty())
			throw new InvalidBookException("ISBN Number cannot be null");
		
		if(publicationYear > Year.now().getValue())
			throw new InvalidBookException("Publication year cannot be in future");
		
		 if (availableCopies < 0)
	            throw new InvalidBookException("Available copies must be >= 0");
		
		this.title = title;
		this.authorName = authorName;
		this.isbnNumber = isbnNumber;
		this.publicationYear = publicationYear;
		this.availableCopies = availableCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public double getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public double getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
	        if (availableCopies < 0)
	            throw new InvalidBookException("Available copies must be >= 0");
	        this.availableCopies = availableCopies;
	 }
	
	@Override
	public String toString() {
		return "Library [title=" + title + ", Author Name=" + authorName + ", ISBN Number=" + isbnNumber + ", Publication Year=" + publicationYear + ", Available Copies=" + availableCopies + "]"; 
	}
	
}
