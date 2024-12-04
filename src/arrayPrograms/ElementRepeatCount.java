package arrayPrograms;

import java.util.Scanner;

public class ElementRepeatCount 
{
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the size of an Array");
	   int size = scan.nextInt();
	    int a[] = new int[size];
	    
	    System.out.println("Enter Values");
	    for(int i=0; i<a.length; i++)
	    {
            a[i] = scan.nextInt();
	    }
	    int count = 0;
	    
	    System.out.println("Enter the Number to check for repetation");
	    int j = scan.nextInt();
	    
	    for (int i = 0; i < a.length; i++) 
	    {
			if(a[i] == j)
			{
				count++;
			}
		}
	    System.out.println("The Number "+j+" is repeated "+count+" times.....!!");
}
}
