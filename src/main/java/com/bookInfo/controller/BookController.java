package com.bookInfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookInfo.model.BookInfo;
import com.bookInfo.service.BookInfoService;


@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired	
	BookInfoService bookInfoService;
	
	@GetMapping("")
	List<BookInfo> getBooks() {	
		return bookInfoService.getBooks();
		
	}
	
	@GetMapping("{/iSBN}")
	public BookInfo getBook(@PathVariable("iSBN") String iSBN) {	
		return bookInfoService.getBook(iSBN);
		
	}
	
	@PostMapping(value ="")
	public Map<String, Object> createBook(@RequestParam(value = "iSBN") String iSBN, 
			@RequestParam(value = "title") String title,
			@RequestParam(value = "author") String author, 
			@RequestParam(value = "date") String date, @RequestParam(value = "rating") Integer rating) {
		
		bookInfoService.createBook(iSBN, title, author, date, rating);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "Book is added");
		return map;
		
	}

}
