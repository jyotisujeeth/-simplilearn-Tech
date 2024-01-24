package oops;

class A5
{
	public void m1()
	{
		System.out.println("welcome ");
	}
	
	public void m2(int a)
	{
		System.out.println(a);
	}
}
class B5 extends A5
{
	public void m1()
	{
		System.out.println("home");
	}
	
	public void m2(int a)
	{
		System.out.println(a);
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		
		A5 obj= new A5();
		obj.m1();
		obj.m2(100);
		
		B5 obj2= new B5();
		obj2.m1();
		obj2.m2(200);
	}

}
