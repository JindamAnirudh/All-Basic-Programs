package stringPrograms;

import java.util.Scanner;

public class ReplaceCharAtSpecificIndex 
{
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
	    System.out.println("Enter the Index value");
	    int n = scan.nextInt();
	    System.out.println("Enter the Character to Replace");
	    char ch = scan.next().charAt(0);
	    String str1 = "";
	    
	    for(int i=0; i<str.length(); i++)
	    {
	    	if(i == n)
	    	{
	    		str1+= ch;
	    	}
	    	else
	    	{
	    		str1+=str.charAt(i);
	    	}
	    }
	    System.out.println("Before Replacing : "+str);
	    System.out.println("Before Replacing : "+str1);
	}
}
