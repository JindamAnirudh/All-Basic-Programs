package arrayPrograms;

import java.util.Scanner;

public class ProductOfArrays 
{
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		int prod = 1;
		
		System.out.println("Enter the Values");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
			prod*=arr[i];
		}
		System.out.println("The Product of Values is "+prod);
	}
}
