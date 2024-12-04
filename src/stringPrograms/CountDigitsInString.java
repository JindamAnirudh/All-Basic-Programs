//WAP to count the number of Digits present in String
package stringPrograms;

import java.util.Scanner;

public class CountDigitsInString 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
        String str = scan.next();
        
        int count = 0;
        
        for(int i=0; i<str.length(); i++)
        {
        	if(Character.isDigit(str.charAt(i)))
        	{
        		count++;
        		System.out.print(str.charAt(i)+" ");
        	}
        }
        System.out.println("\n The Count of the Digits : "+count);
		
	}
}
