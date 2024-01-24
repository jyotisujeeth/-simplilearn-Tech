package oops;

class ABC
{
	//NANR
	public void m1()
	{
		int a=10;
		int b=20;
		System.out.println("sum of NANR = "+(a+b));
	}
	
	//NAWR
	public int m2()
	{
		int a=20;
		int b=30;
		int c;
		c=a+b;
		return c;
		
	}
	
	//WANR
	
	public void m3(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum of WANR = "+c);
	}
	
	//WAWR
	
	public int m4(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
}


public class function_types {

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.m1();
		int r=obj.m2();
		System.out.println("sum of NAWR = "+r);
		
		obj.m3(30, 40);
		int e= obj.m4(50, 50);
		System.out.println("sum of WAWR = "+e);
		

	}

}
