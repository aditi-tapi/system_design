package com.library.dao.implem;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.List;

import com.library.dao.iface.LibraryDao;
import com.library.domain.Books;

public  class LibraryDaoImplementation implements LibraryDao{
	HashMap<Integer,Books> books;
	
	public LibraryDaoImplementation(){
		books = new HashMap<>();
		Books book1 = new Books("ram",1,"book1");
		Books book2 = new Books("ramesh",2,"book2");
		books.put(0, book1);
		books.put(1, book2);
	}
	//System.out.println(books);
	@Override
	public void deleteBook(Books book)
	{
		if(!books.containsKey(book.getISDN()))
			return;
		else
		{
			books.remove(book.getISDN());
			System.out.println("book deleted with isdn: " + book.getISDN());
		}
	}
	@Override
	public void updateBook(Books book)
	{
		//if(!books.containsKey(book.getISDN()))
			books.put(book.getISDN(), book);
	
	}
	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		List<Books> list = new ArrayList<Books>();
		for(int i=0;i<books.size();i++)
			{
			list.add(books.get(i));
			}
		return list;
	}
	@Override
	public Books getBook(int isdn) {
		// TODO Auto-generated method stub
		
		return books.get(isdn);
	}
	
	
	
}
