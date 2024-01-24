package Exception_handling;

public class try1 {

	public static void main(String[] args) {
		
		try 
		{
		int a=10;
		int b=0;
		
		int c;
		c=a/b;  
		
		System.out.println(c);
		}
		
		catch(Exception e) 
		{
//			System.out.println("the number is divided by zero and giving undefined !");
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}

	}

}
