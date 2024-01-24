package Exception_handling;

class exp
{
	public void age(int a)
	{
		
		if(a>18)
		{
			System.out.println("Access Granted");
		}
		else
		{
			throw new ArithmeticException("it should be 18+");
		}
		
		
		
//		try
//		{
//			if(a>18)
//			{
//				System.out.println("Access Granted ");
//			}
//			
//			else
//			{
//				throw new ArithmeticException("Age should be 18+");
//			}
//			
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		
		
		
	}
}


public class throw1 {

	public static void main(String[] args) {
		
		exp obj= new exp();
		obj.age(16);

	}

}
