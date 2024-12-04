package stringPrograms;

import java.util.Scanner;

public class ProductOfDigits 
{
	 public static void main(String[] args) 
	    {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the String");
	        String str = scan.next();
	     
	        int prod = 1;
	        for(int i=0; i<str.length(); i++)
	        {
	        	char ch = str.charAt(i);
	        	if(Character.isDigit(ch))
	        	{
	        		String s1 = " "+ch;
	        		int a=Integer.valueOf(s1);
	        		prod*=a;
	        	}
	        }
	      
			System.out.println(prod);
		}
}
