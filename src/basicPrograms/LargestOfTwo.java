// WAP to check the Largest of Two Numbers
package basicPrograms;

import java.util.Scanner;

public class LargestOfTwo 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First value");
		int m=sc.nextInt();
		System.out.println("Enter Second value");
		int n=sc.nextInt();
		
		if (m>n) 
		{
			System.out.println(m+" is greater value");
		}
		else 
		{
			System.out.println(n+" is greater value");
		}
    }
}