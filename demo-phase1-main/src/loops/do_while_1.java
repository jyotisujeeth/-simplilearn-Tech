package loops;

public class do_while_1 {

	public static void main(String[] args) {
		
		int i=1;
		int sum =0;
		
		do
		{
			if(i%2==0)
			{
			System.out.println(i);
			sum=sum+i;
			}
			i++;
		}
		while(i<=10);
		System.out.println("sum ="+sum);

	}

}
