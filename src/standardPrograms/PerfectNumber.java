//WAP to check whether given  umber is perfect number or not
package standardPrograms;

import java.util.Scanner;

public class PerfectNumber 
{
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=scan.nextInt();
	
	int sum=0;
	for(int i=1; i<=n/2; i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
	}
	if (n==sum)
	{
		System.out.println(n+" is a Perfect Number");
	}
	else
		System.out.println(n+" is not a Perfect Number");
}
}
