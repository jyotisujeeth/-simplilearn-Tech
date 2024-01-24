package oops;

class c1 //class
{
	int a; //fields 
	double b;
	
	public void f1() //method 
	{
		System.out.println("this is function 1");
	}
	
	public void f2()
	{
		System.out.println("this is function 2");
	}
}


public class ex2 {

	public static void main(String[] args) {
		
		c1 obj = new c1(); //new keyword 
		obj.f1();
		obj.f2();
		
		obj.a=10;
		obj.b=2.5;
		
		
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
