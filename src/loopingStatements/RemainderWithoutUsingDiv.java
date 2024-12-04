/*WAP to print the Remainder of the Number Without using any Division
operator*/
package loopingStatements;

import java.util.Scanner;

public class RemainderWithoutUsingDiv 
{
	 public static void main(String[] args) 
	   {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the Divident");
		   int divident=scan.nextInt();
		   System.out.println("Enter the Divisor");
		   int divisor=scan.nextInt();
		   //int count = 0;
		   
		   while(divident >= divisor)
		   {
			  divident=divident-divisor;
			  //count++;
		   }
		   System.out.println("Remainder is : "+divident);   
	}
	}


   

