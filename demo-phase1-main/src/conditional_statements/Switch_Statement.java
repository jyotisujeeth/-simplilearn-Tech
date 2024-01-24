package conditional_statements;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int c;

		System.out.println("enter your choice : ");
		c=sc.nextInt();
		
		switch(c) 
		{
		case 1: System.out.println("today  is monday !");
		break;
		case 2: System.out.println("today  is Tuesday !");
		break;
		case 3: System.out.println("today  is wednesday !");
		break;
		case 4: System.out.println("today  is Thursday !");
		break;
		case 5: System.out.println("today  is Friday !");
		break;
		
		default: System.out.println("wrong choice !");
		}
		

	}

}
