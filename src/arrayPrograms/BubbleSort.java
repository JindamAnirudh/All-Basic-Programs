package arrayPrograms;

import java.util.Scanner;

public class BubbleSort 
{
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size = scan.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the Values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{ 
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
