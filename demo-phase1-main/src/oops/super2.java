package oops;

class U1
{
	void m1()
	{
		System.out.println("i am m1 of u1 class ");
	}
}

class U2 extends U1
{
	void show()
	{
		super.m1();
	}
}
public class super2 {

	public static void main(String[] args) {
		U2 obj= new U2();
		obj.show();

	}

}
