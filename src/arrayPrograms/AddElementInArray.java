package arrayPrograms;

import java.util.Scanner;

public class AddElementInArray
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = scan.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the Values");
		for(int i=0; i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the Number of Values You are going to add in array");
		
			int nc = scan.nextInt();
		
		int a1[] = new int[size+nc];
		System.out.println("Enter the Index Value");
		int index = scan.nextInt();
		
		int k=0;
		for(int i=0; i<a.length;i++)
		{
			if(index == i) 
			{
			for(int j=0; j<nc; j++)
			{
				System.out.println("Enter the Values");
				a1[k] = scan.nextInt();
				k++;
			}
		}
		     a1[k] =a[i];
				k++;
		}
		System.out.println("*****After Adding*****");
		for(int i=0; i<a1.length; i++)
		{
			System.out.println(a1[i]+" ");
		}
	}
}
