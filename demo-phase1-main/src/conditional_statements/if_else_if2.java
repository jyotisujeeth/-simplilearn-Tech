package conditional_statements;

public class if_else_if2 {

	public static void main(String[] args) {
		
		
		int a=150;
		int b=120;
		int c=250;
		
		if((a>b) && (a>c))
		{
			System.out.println("a is greater ! ");
		}
		
		else if((b>a) && (b>c))
		{
			System.out.println("b is greater ! ");
		}
		
		else
		{
			System.out.println("c is greater ! ");
		}
		

	}

}
