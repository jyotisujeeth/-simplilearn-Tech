package oops;

import java.util.Scanner;

class Person 
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	

}

public class encapsulation1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person obj =  new Person();
		
		System.out.println("enter the id : ");
		int a=sc.nextInt();
		
		System.out.println("enter the name : ");
		String n=sc.next();
		
		obj.setId(a);
		obj.setName(n);
		
		System.out.println(obj.toString());

	}

}
