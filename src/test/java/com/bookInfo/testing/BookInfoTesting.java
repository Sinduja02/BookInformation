package com.bookInfo.testing;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.bookInfo.model.BookInfo;
import com.bookInfo.service.BookInfoService;
import com.bookInfo.service.BookInfoServiceImpl;
import org.slf4j.Logger;


public class BookInfoTesting {
	
	@InjectMocks BookInfoService bi;
	@InjectMocks private Logger logger;
	
	@Test
	public void testbook() {
	try {
		
		String iSBN = "ISBN1";
		String title= "Restart";
		String author= "Gordon Korman";
		String date= "03/01/2021";
		Integer rating= 5 ;
		
		BookInfo bookInfo = new BookInfo();
		bookInfo.setISBN(iSBN);

		List<BookInfo> resp = bi.getBooks();
		
		
		assertEquals("Did not return proper title", (String) bookInfo.getTitle(), title);
		assertEquals("Did not return proper author", (String) bookInfo.getAuthor(), author);
		assertEquals("Did not return proper date", (String) bookInfo.getDateAsString(date), date);
		assertEquals("Did not return proper rating", (Integer) bookInfo.getRating(), rating);
		
	} catch (Exception e) {
		e.printStackTrace();
		logger.error("Error while find the ISBN",e);
		
	} 
	}
}
