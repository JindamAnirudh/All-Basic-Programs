//WAP for Multiplication Table for any Given Number
package standardPrograms;

import java.util.Scanner;

public class MultiplicationTables 
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the Number to get Multiplication table");
    	int num = scan.nextInt();
    	
    	for (int i = 1; i <= 10; i++) 
    	{
			int mul = num * i;
			System.out.println(num+" * "+i+" = "+mul);
		}
	}
}
