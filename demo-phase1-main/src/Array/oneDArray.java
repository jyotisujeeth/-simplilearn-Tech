package Array;

import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the total elements of array");
		n=sc.nextInt();

		int a[] = new int[n];
		
		
		
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
