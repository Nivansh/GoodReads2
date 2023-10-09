package com.example.goodreads.service;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.example.goodreads.model.Book;
import java.util.Collection;
public class BookMYSQLService
{
HashMap<Integer, Book> hmap=new HashMap<>();
public BookMYSQLService()
{
	 Book b1=new Book(1,"harry potter","harrypotter.jpg");
	 Book b2=new Book(2,"Rise","rise.jpg");	
	 hmap.put(b1.getId(), b1);
	 hmap.put(b2.getId(), b2);
	
}
public ArrayList<Book> getBooks()
{
	Collection<Book> bookCollection= hmap.values();
	ArrayList<Book> books=new ArrayList<>(bookCollection);
	return books;	
}
public Book getBookById(int bookId)
{
	 Book book= hmap.get(bookId);
	 if(book==null)
	 {
		 throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	 }
	 return book;
}
}
