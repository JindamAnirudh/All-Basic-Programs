//WAP to Print Factorial of a Number
package standardPrograms;

import java.util.Scanner;

public class FactorialOfaNumber 
{
    public static void main(String[] args) 
    {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int n=scan.nextInt();
	   
	    int fact=1;
	    for(int i=1; i<=n; i++)
	    {
	    	fact*=i;
	    }
	    System.out.println("Factorial of Number "+n+" is "+fact);
	}
}
