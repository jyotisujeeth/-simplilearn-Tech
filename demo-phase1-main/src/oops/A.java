package oops;

class A1
{
	public void m1()
	{
		System.out.println("A class method");
	}
}

class B1 extends A1
{
	public void m2()
	{
		System.out.println("B class method ");
	}
}


public class A {

	public static void main(String[] args) {
		

		
		B1 obj2= new B1();
		obj2.m2();
		obj2.m1();
	}

}
