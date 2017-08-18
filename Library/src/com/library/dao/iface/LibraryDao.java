package com.library.dao.iface;

import java.util.List;

import com.library.domain.Books;


public interface LibraryDao {
	public List<Books> getAllBooks();
	   public Books getBook(int isdn);
	   public void updateBook(Books book);
	   public void deleteBook(Books book);
	
}
