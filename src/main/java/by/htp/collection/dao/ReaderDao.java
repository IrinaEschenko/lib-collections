package by.htp.collection.dao;

import java.util.List;

import by.htp.collection.entity.User;
import by.htp.collection.entity.Book;

import by.htp.collection.entity.User;

interface ReaderDao {
	public boolean authorize(User user) ;
	
   void seeCatalog();
   Book read(int id) ;
	   
   }

