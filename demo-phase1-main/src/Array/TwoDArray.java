package Array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int a[][]= {{10,12},{14,16}};
		
		System.out.println("Two D Array is : ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.print("\n\n");
		}

	}

}
