//WAP to find Sum of the Digits present in String
package stringPrograms;

import java.util.Scanner;

public class SumOfDigitsInStr 
{
	 public static void main(String[] args) 
	    {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the String");
	        String str = scan.next();
	        System.out.println(SumOfDigits(str));
	    }
	     public static int SumOfDigits(String s)
	     {
	        int sum = 0;
	        for(int i=0; i<s.length(); i++)
	        {
	        	char ch = s.charAt(i);
	        	if(Character.isDigit(ch))
	        	{
	        		String s1 = " "+ch;
	        		int a=Integer.valueOf(s1);
	        		sum+=a;
	        	}
	        }
	      
			return sum;
		}
}
