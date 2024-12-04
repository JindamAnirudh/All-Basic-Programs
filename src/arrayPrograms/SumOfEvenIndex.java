package arrayPrograms;

import java.util.Scanner;

public class SumOfEvenIndex 
{
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		int sum = 0;
		
		System.out.println("Enter the Values");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
			if(i%2 == 0)
			{
				sum+=arr[i];
			}
		}
		
		System.out.println("The Summation of Even Indexed Values is "+sum);
	}
}
