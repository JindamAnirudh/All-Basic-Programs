//WAP to print prime numbers between M and N
package standardPrograms;

import java.util.Scanner;

public class PrimesBetweenMandN 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter M Value");
		int m = scan.nextInt();
		System.out.println("Enter N Value");
		int n = scan.nextInt();
		
		
		for(int i=m; i<=n; i++)
		{
			if(i == 1)
			{
				continue;
			}
			boolean isPrime = true;
			for(int j=2; j<i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					
				}
			}
			if(isPrime == true)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
