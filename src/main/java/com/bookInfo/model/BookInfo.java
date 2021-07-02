package com.bookInfo.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BookInfo {

	
	public BookInfo() {
		super();
	}
	private static final DateFormat dtFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	
	public BookInfo(String iSBN, String title, String author, String date, Integer rating) {
		super();
		this.ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.date = date;
		this.rating = rating;
	}
	
	private String ISBN;
	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public static String getDateAsString(String date) {
		
		if (date == null) {
			return null;
		}
		return dtFormat.format(date);
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}

	private String title;
	private String author;
	private String date;
	private Integer rating;
}
