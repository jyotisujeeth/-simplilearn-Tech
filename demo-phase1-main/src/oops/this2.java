package oops;

class t2
{
	void m1()
	{
		System.out.println("method 1");
	}
	
}

class t3 extends t2
{
	void m1()
	{
		System.out.println("hii t3 method1");
	}
	
	void m2()
	{
		this.m1();
	}
}


public class this2 {

	public static void main(String[] args) {
		t3 obj= new t3();
		obj.m2();

	}

}
