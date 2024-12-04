//WAP to Check the Smallest of Three Numbers
package basicPrograms;

import java.util.Scanner;

public class SmallestOfThree 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the First Value");
	int a=scan.nextInt();
	System.out.println("Enter the Second Value");
	int b=scan.nextInt();
	System.out.println("Enter the Third Value");
	int c=scan.nextInt();
	
	if(a<b && a<c)
	{

		System.out.println(a+" is Smaller");
	}
	else if(b<c)
	{

		System.out.println(b+" is Smaller");
	}
	else
	{

		System.out.println(c+" is Smaller");
	}
}
}
