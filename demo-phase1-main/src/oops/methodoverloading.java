package oops;

class O1
{
	public void m1()
	{
		System.out.println("welcome !");
	}
	
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public void m1(double a)
	{
		System.out.println(a);
	}
	
	public void m1(int a, double b)
	{
		System.out.println(a+"  "+b);
	}
	
	public void m1(double b,int a)
	{
		System.out.println(a+"  "+b);
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		
		O1 obj= new O1();
		obj.m1();
		obj.m1(10);
		obj.m1(12.4);
		obj.m1(10, 20.3);
		obj.m1(13.8, 10);
	}

}
