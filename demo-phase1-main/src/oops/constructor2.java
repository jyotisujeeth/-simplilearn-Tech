package oops;

class Q
{
	Q()
	{
		System.out.println("welcome");
	}
	
	Q(String name, int marks)
	{
		this();
		System.out.println("name = "+name);
		System.out.println("marks = "+marks);
	}
}


public class constructor2 {

	public static void main(String[] args) {
		
		Q ob = new Q("sakshi", 90);
		

	}

}
