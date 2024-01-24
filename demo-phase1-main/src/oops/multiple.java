package oops;

class F3
{
	public void m1()
	{
		System.out.println("m1");
	}
}

class M3
{
	public void m1()
	{
		System.out.println("m1");
	}
}

class S3 extends F3
{
	public void m3()
	{
		System.out.println("m3");
	}
	
}


public class multiple {

	public static void main(String[] args) {
		
		S3 obj = new S3();
		obj.m3();
		obj.m1();
		
	}

}
