package org.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserialize {

	public static void serialize() throws IOException {
		Employee employee = new Employee("IT",25, "server", "Mike", 34, "001894536");
		//Set static variable
		Employee.lastName = "harvey";		
		FileOutputStream output = new FileOutputStream(new File("savePerson.txt"));
		ObjectOutputStream outputStream = new ObjectOutputStream(output);
		outputStream.writeObject(employee);
		outputStream.close();
		output.close();
		System.out.println("Serialized the Employee object : "+employee);
		
		//Update the static variable to confirm that its not serialized
		Employee.lastName = "Setting last name after serialization";
		Employee.employCode = 9999;
	} 
	public static void deSerialize() throws IOException, ClassNotFoundException {
		
		FileInputStream inputStream = new FileInputStream(new File("savePerson.txt"));
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		Employee employee = (Employee) objectInputStream.readObject();
		System.out.println("Deserialize the Employee object :"+ employee);
		objectInputStream.close();
		inputStream.close();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serialize();
		deSerialize();
	}
}
