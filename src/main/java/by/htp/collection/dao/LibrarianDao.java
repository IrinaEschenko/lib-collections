package by.htp.collection.dao;

import by.htp.collection.entity.Book;
import by.htp.collection.entity.Librarian;
import by.htp.collection.entity.User;

interface LibrarianDao {
	
	public boolean authorize(int id, String pass) ;
	
	   void seeCatalogReaders();
	   void addReader();
	   void addBook();
	   void manageBook();
	   void giveBookReader(int bookId);
	   void getBookReader(int bookId);
}
