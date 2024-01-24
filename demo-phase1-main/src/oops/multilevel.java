package oops;

class GF
{
	public void m1()
	{
		System.out.println("grand father ! ");
	}
}

class F extends GF
{
	public void m2()
	{
		System.out.println("father ! ");
	}
}

class S extends F
{
	public void m3()
	{
		System.out.println("son !");
	}
}


public class multilevel {

	public static void main(String[] args) {
		
		S obj = new S();
		
		obj.m3();
		obj.m2();
		obj.m1();

	}

}
