//WAP to check the Largest of Three Numbers
package basicPrograms;

import java.util.Scanner;

public class LargestOfThree 
{
	public static void main(String[] args)
	{
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first value");
	int i=scan.nextInt();
	System.out.println("Enter second value");
	int j=scan.nextInt();
	System.out.println("Enter third value");
	int k=scan.nextInt();
	
	if (i>j && i>k)
	{
		System.out.println(i+" is greater value");
	}
	else if (j>k)
	{
		System.out.println(j+" is greater value");
	}
	else
	{
		System.out.println(k+" is greater value");
	}
}

}
