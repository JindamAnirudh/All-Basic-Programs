package arrayPrograms;

import java.util.Scanner;

public class MissingValues 
{
    public static void main(String[] args) 
    {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the Size of an array");
		  int size = scan.nextInt();
		  
		  int a[] = new int[size];
		  
		  System.out.println("Enter the Values");
		  for(int i=0; i<a.length; i++)
		  {
			  a[i] = scan.nextInt();
		  }
		  System.out.println("Missing Values are");
		  for(int i=0; i<a.length-1; i++)
		  {
			  for(int j=a[i]+1; j<a[i+1]; j++)
			  {
				  System.out.println(j+" ");
			  }
		  }
	}
}
