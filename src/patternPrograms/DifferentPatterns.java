package patternPrograms;

import java.util.Scanner;

public class DifferentPatterns 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N value");
		int n = scan.nextInt();
		
		 for(int i=0; i<n; i++)
		  {
			  for(int j=0; j<n; j++)
			  {
				  if(i==2 && j==2)
				  {
					  System.out.print("@ ");
				  }
				  else
				  System.out.print("* ");
				  
			  }
			  System.out.println();
		  }
		 System.out.println();
		 
		 for(int i=0; i<n; i++)
		  {
			  for(int j=0; j<n; j++)
			  {
				  if(i==0 && j==3 || i==2 && j==1 || i==3 && j==3)
				  {
					  System.out.print("$ ");
				  }
				  else
				  System.out.print("! ");
				  
			  }
			  System.out.println();
		  }
		 System.out.println();
		 
		 for(int i=0; i<n; i++)
		  {
			  for(int j=0; j<n; j++)
			  {
				  if(i==0 && j==2 || i==2 && j==3 || i==3 && j==2)
				  {
					  System.out.print("A ");
				  }
				  else
				  System.out.print("# ");
				  
			  }
			  System.out.println();
		  }
	}
}
