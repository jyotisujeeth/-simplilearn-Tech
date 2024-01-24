package Exception_handling;

public class try2 {

	public static void main(String[] args) {
		
		try
		{
		int a[]= {2,8,9,5};
		
		System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println("Array out of bound");
		}
		finally 
		{
			System.out.println("i am finally block !");
		}
		
	}

}
