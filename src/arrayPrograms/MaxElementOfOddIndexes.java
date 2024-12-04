package arrayPrograms;

import java.util.Scanner;

public class MaxElementOfOddIndexes 
{
	 public static void main(String[] args) 
	   {
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the Size of an Array");
			 int size = scan.nextInt();
			 
			 int []a = new int[size];
			 System.out.println("Enter the Values");
			 
	         for(int i=0; i<a.length; i++)
	         {
	        	 a[i] = scan.nextInt();
	         }
	         int biggest = a[0];
	         for(int i=1; i<a.length; i++)
	         {
	                if(i %2 != 0)
	        	 {
	        		 if(biggest < a[i])
	        		 {
	        			 biggest = a[i];
	        		 }
	        			 	 
	        	 }
	         }
			System.out.println("The Biggest Value of Odd Indexes is : "+biggest);
	   }
}
