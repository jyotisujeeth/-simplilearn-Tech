package oops;

class F2
{
	public void m1()
	{
		System.out.println("father ! ");
	}
}

class S1 extends F2
{
	public void m2()
	{
		System.out.println("Son 1 !");
	}
}

class S2 extends F2
{
	public void m3()
	{
		System.out.println("son 2 !");
	}
}


public class hierarchical {

	public static void main(String[] args) {
		
		S1 obj1 = new S1();
		obj1.m2();
		obj1.m1();
		
		
		S2 obj2 = new S2();
		obj2.m3();
		obj2.m1();
		
		
	}

}
