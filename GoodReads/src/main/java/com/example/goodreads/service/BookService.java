package com.example.goodreads.service;
import java.util.ArrayList;
import java.util.HashMap;
import com.example.goodreads.model.Book;

import java.util.Collection;
public class BookService
{
HashMap<Integer, Book> hmap=new HashMap<>();
public BookService()
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
}


