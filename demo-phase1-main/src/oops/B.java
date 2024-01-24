package oops;

class Father 
{
	int a=10,b=20;
	public void f1()
	{
		
		System.out.println("resule of Father class="+(a*b));
	}
}

class Son extends Father
{
	public void f2()
	{
		
		System.out.println("result of son class ="+(a+b));
	}
}


public class B {

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.f2();
		obj.f1();

	}

}
