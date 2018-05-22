package com.example.springboottest;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BooksController {
@GetMapping("/books")
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Harry Porter", "J.K.Rowling"));
		return books;
	}
}
