package arrayPrograms;

import java.util.Scanner;

public class PrimeNumbersInArray 
{  
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the Values");
		
		for(int i=0;i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<arr.length; i++)
		{	
		    int temp = arr[i];
		
		    boolean isPrime = true;
		
		for(int j=2; j<temp; j++)
		{
			if(temp % j ==0) 
			{
	            isPrime = false;
			}
		}
		
		if(isPrime == true)
		{
			System.out.println(arr[i]+" ");
		}
	 }
  }
}
