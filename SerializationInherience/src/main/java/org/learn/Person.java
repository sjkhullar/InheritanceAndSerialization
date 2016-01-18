package org.learn;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	public String firstName;
	public static String lastName = "Static member will not be serialzed";
	public int age;
	public transient String contact = "Trasient member will not be serialized";
	public Person(String firstName,int age, String contact) {
		this.firstName = firstName;
		this.age = age;
		this.contact = contact;
	}
	
	public String toString() {
	    return "[" + firstName + " " + lastName +
		       " " + age + " " +contact +"]";
	}
}