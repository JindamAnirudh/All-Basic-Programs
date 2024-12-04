//WAP to check the Largest of Five Numbers
package basicPrograms;

import java.util.Scanner;

public class LargestOfFive 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a=scan.nextInt();
		System.out.println("Enter the Second Value");
		int b=scan.nextInt();
		System.out.println("Enter the Third Value");
		int c=scan.nextInt();
		System.out.println("Enter the Fourth Value");
		int d=scan.nextInt();
		System.out.println("Enter the Fifth Value");
		int e=scan.nextInt();
		
		if(a>b && a>c && a>d && a>e)
		{

			System.out.println(a+" is Greater Number");
		}
		else if (b>c && b>d && b>e)
		{

			System.out.println(b+" is Greater Number");
		}
		else if( c>d && c>e)
		{

			System.out.println(c+" is Greater Number");
		}
		else if (d>e)
		{

			System.out.println(d+" is Greater Number");
		}
		else
			System.out.println(e+" is Greater Value");
		
	}

}
