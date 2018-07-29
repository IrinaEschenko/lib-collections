package by.htp.collection.entity;

import java.util.Comparator;

public class UserComparator implements Comparator<User>{


	public int compare(User u1, User u2) {
		
		// TODO Auto-generated method stub
		return u1.getAge() - u2.getAge();
	}

	
	
	
}
