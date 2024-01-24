package oops;

class fruits
{
	public void m1()
	{
		System.out.println("this is my method 1 ");
	}
	
	public void m2()
	{
		System.out.println("this is my method 2 ");
	}
	
	public void m3()
	{
		System.out.println("this is my method 3 ");
	}
}



public class ex1 {

	public static void main(String[] args) {
		
		fruits obj = new fruits();
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m1();
		obj.m1();
		obj.m1();

	}

}
