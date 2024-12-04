package arrayPrograms;

import java.util.Scanner;

public class OddIndexes 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = scan.nextInt();
		
	    String [] s = new String [size];
	    System.out.println("Enter the Values ");
	    for(int i=0; i<s.length; i++)
	    {
	    	s[i] = scan.next();
	    }
	    for(int i=0; i<s.length; i++)
	    {
	    if(i%2 !=0)
	    {
	    	System.out.println(s[i]);
	    }
	    }
	}
}
