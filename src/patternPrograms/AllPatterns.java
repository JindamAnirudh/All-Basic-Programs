package patternPrograms;

import java.util.Scanner;

public class AllPatterns 
{
	public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the Value of N");
	   int n = scan.nextInt();
	   
	   for(int i=0; i<n; i++)
	   {
		   for(int j=0; j<n; j++)
		   {
			   if(i>=j)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
	
	   System.out.println();
	   
	   
	   for(int i=0; i<n; i++)
	   {
		   for(int j=0; j<n; j++)
		   {
			   if(i+j >= n-1)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
	   
	   System.out.println();
	   
	   
	   for(int i=0; i<n; i++)
	   {
		   for(int j=0; j<n; j++)
		   {
			   if(i+j <= n-1)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
	   System.out.println();
	   
	   
	   for(int i=0; i<n; i++)
	   {
		   for(int j=0; j<n; j++)
		   {
			   if(j>=i)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
 System.out.println();
	   
	   
	   for(int i=0; i<n; i++)
	   {
		   for(int j=0; j<n; j++)
		   {
			   if(i<=n-3 && i+j == n-3 && i+j >= n-3)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
}
}
