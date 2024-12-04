package patternPrograms;

import java.util.Scanner;

public class Patterns2 
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
			   if(i == j)
			   {
				   System.out.print("a ");
			   }
			   else
			   {
				   System.out.print("* ");
			   }
		   }
		   System.out.println();
	   }
   }
}
