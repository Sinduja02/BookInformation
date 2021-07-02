package com.bookInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.server", "com.server.config"})
public class BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoApplication.class, args);
	}

}
