package by.htp.collection.run;

import java.util.ArrayList;

import by.htp.collection.entity.Book;
import by.htp.collection.entity.User;

import java.io.*;

public class ArrayListSerialization {
	public static void main(String[] args) {
		activateBooks();
		activateReaders();
		showReaders();
		// activateLibrarians();
		showBooks();

	}

	public static void activateReaders() {
		ArrayList<User> al = new ArrayList<User>();
		al.add(new User(30, "Vasilij"));
		al.add(new User(20, "Petr"));
		al.add(new User(23, "Lisa"));

		try {
			FileOutputStream fos = new FileOutputStream("D:/myfile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public static void showReaders() {
		ArrayList<User> arraylist = new ArrayList<User>();
		try {
			FileInputStream fis = new FileInputStream("D:/myfile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		for (User tmp : arraylist) {
			System.out.println(tmp);
		}

	}

	public static void activateBooks() {
		ArrayList<Book> alBooks = new ArrayList<Book>();
		alBooks.add(new Book(1, "Whale and Snail", "Julia Donaldson", 1, "about travelling"));
		alBooks.add(new Book(2, "Denis's stories", "Viktor Dragunskij", 1, "about little boy"));
		alBooks.add(
				new Book(3, "Tree little Pigs", "FairyTale", 1, "about three little pigs who wants to build houses"));

		try {
			FileOutputStream fos = new FileOutputStream("D:/myBooks.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(alBooks);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public static void showBooks() {
		ArrayList<Book> arraylist = new ArrayList<Book>();
		try {
			FileInputStream fis = new FileInputStream("D:/myBooks.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		for (Book tmp : arraylist) {
			System.out.println(tmp);
		}

	}
}
