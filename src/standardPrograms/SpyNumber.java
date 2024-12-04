//WAP to check whether given number is SpyNumber or not
package standardPrograms;

import java.util.Scanner;

public class SpyNumber 
{
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		int sum = 0;
		int prod = 1;
		int n = num;
		
		while(num > 0)
		{
			int temp = num % 10;
			sum+= temp;
			prod*= temp;
			num = num/10;
		}
		if(sum == prod)
		{
			System.out.println(n+" is a Spy NUmber");
		}
		else
			System.out.println(n+" is not a Spy NUmber");
	 }
}
