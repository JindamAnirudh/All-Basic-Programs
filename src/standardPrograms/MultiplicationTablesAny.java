//WAP for Multiplication Tables for all the numbers provided in range
package standardPrograms;

import java.util.Scanner;

public class MultiplicationTablesAny 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		int num1 = scan.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = scan.nextInt();
		
		for(int i=num1; i<=num2; i++)
		{
			for(int j=1; j<=10; j++)
			{
				int mul = num1 * j;
		   System.out.println(num1+" * "+j+" = "+mul);
			}
		   System.out.println("---------------");
			num1++;
		}
		
	}
}
