package oops;

class L1
{
	int a =10;
}

class L2 extends L1
{
	int a=20;
	
	void display(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


public class super1 {

	public static void main(String[] args) {
		
		L2 obj= new L2();
		obj.display(30);

	}

}
