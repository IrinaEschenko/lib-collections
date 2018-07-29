package by.htp.collection.entity;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable {
	
	public int compareTo(User user) {
		int result = this.name.compareTo(user.name);
		if(result == 0) {
			return this.age - user.age;			
			
		}

		return result;
	}

	private int age;
	private String name;
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public User() {
		
		super();	
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (age != other.age)
//			return false;
//		return true;
//	}

	public User(int age) {
		super();
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
