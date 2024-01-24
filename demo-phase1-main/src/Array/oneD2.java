package Array;

public class oneD2 {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8};
		int b[]= {1,3,5,7};
		int c[]= new int[4];
		
		for(int i=0;i<4;i++)
		{
			c[i]=a[i]*b[i];
			
		}
		
		System.out.println("multiplication of A and B array is : ");
		
		for(int i=0;i<4;i++)
		{
			System.out.println(c[i]);
		}

	}

}
