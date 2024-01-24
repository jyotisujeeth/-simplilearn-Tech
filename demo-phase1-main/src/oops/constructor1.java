package oops;

class P
{
	
	public void f1()
	{
		System.out.println("hii i am method ! ");
	}
	public P() //constructor 
	{
		System.out.println("hii i am constructor ! ");
	}
}
public class constructor1 {

	public static void main(String[] args) {
		
		P obj = new P();
		obj.f1();

	}

}
