package org.learn;

public class Employee extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String department;
	public static int employCode = 1010;
	public int salary;
	public transient String project = "Trasient member will not be serialized";
	public Employee(String department,int salary, String project,
			String firstName,int age, String contact) {
		super(firstName,age, contact);
		this.department = department;
		this.salary = salary;
		this.project = project;		
	}
	public String toString() {
	    return  super.toString() + "[" + department + " " + employCode +
		       " " + salary + " " +project +"]";
	}
}