//WAP to check given number is Strong Number or not
package standardPrograms;

import java.util.Scanner;

public class StrongNumber
{
   public static void main(String[] args) 
   {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=scan.nextInt();
	int  num=n;
	int sum=0;
	
	while(n>0)
	{
		int fact=1;
		for(int i=1; i<=n%10; i++)
		{
			fact*=i;
		}
		  sum+=fact;
		  n/=10;
	}
	if(sum==num) 
	{
		System.out.println(num+" is a Strong Number");
	}
	else
		System.out.println(num+" is not a Strong Number");
}
}
