package com.bookInfo.service;


import java.util.List;


import com.bookInfo.model.BookInfo;
public interface BookInfoService {

	
	List<BookInfo> getBooks();
	
	BookInfo getBook(String iSBN);
	
	void createBook(String iSBN, String title, String author, String date, Integer rating);
}
