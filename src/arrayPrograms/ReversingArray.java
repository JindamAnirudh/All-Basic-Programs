//WAP to Read and Print Array in Reversing Order
package arrayPrograms;

import java.util.Scanner;

public class ReversingArray 
{
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scan.nextInt();
		
		int []a = new int[size];
		
		System.out.println("Enter the Values : ");
		for(int i=0; i<a.length; i++)//a.length = size
		{
			a[i] = scan.nextInt();
		}
		
		System.out.println("=====*****=====");
		System.out.println("Values in Reversing Order");
		
		for(int i=a.length-1; i>=0; i--)//a.length = size
		{
			System.out.println(a[i]);
		}
	}
}
