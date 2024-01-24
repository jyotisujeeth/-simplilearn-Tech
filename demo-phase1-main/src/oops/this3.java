package oops;

class t5
{
	t5()
	{
		System.out.println("welcome");
	}
	
	
	t5(int a)
	{
		this();
		System.out.println("hello "+a);
	}
	
	
}

public class this3 {

	public static void main(String[] args) {
		t5 obj= new t5(100);

	}

}
