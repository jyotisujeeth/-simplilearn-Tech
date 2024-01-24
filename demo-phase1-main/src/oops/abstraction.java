package oops;

abstract class Vehicle 
{
	abstract void start();
}

class Car extends Vehicle
{

	@Override
	void start() {
		System.out.println("Car starts through keys !");
		
	}
	
}

class Scooter extends Vehicle
{

	@Override
	void start() {
		System.out.println("it starts with kick !");
		
	}
	
}


public class abstraction {

	public static void main(String[] args) {
		
		Car c= new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();

	}

}
