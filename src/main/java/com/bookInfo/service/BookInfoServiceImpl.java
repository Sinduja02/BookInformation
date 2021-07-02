package com.bookInfo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bookInfo.model.BookInfo;

public abstract class BookInfoServiceImpl implements BookInfoService {

	public BookInfoServiceImpl() {
		books.add(new BookInfo("ISBN1", "Restart", "Gordon Korman", "03/01/2021", 5));
		books.add(new BookInfo("ISBN3", "The Name Jar", "Choi", "03/10/2021", 4));
		books.add(new BookInfo("ISBN4", "The Rainbow Fish", "Marcus", "06/11/2021", 3));
		books.add(new BookInfo("ISBN5", "Be Brave Oliver", "Deborah", "05/003/2021", 4));
	}

	List<BookInfo> books = new ArrayList<BookInfo>();

	public List<BookInfo> getBookInfo() {

		return books;
	}

	public BookInfo getBook(String iSBN) {
		Iterator<BookInfo> iterator = books.iterator();
		while (iterator.hasNext()) {
			BookInfo book = iterator.next();
			if (book.getISBN().equals(iSBN)) {
				return book;
			}
		}
		return null;
	}

	public void createBook(String iSBN, String title, String author, String date, Integer rating) {
		books.add(new BookInfo(iSBN, title, author, date, rating));
	}
	}
