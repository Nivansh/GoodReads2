package com.example.goodreads.controller;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.goodreads.model.Book;
import com.example.goodreads.service.BookService;

@RestController
public class BookController
{
BookService bookService=new BookService();
@GetMapping("/books")
	public ArrayList<Book> getBooks()
	{
		return bookService.getBooks();
	}
}


