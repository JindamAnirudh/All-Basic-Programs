package stringPrograms;

import java.util.Scanner;

public class RemoveDuplicatesInString 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
	    String str1 = "";
	    
	    for(int i=0; i<str.length(); i++)
	    {
	    	char ch = str.charAt(i);
	    	if(str1.indexOf(ch) == -1)
	    	{
	    		str1 += ch;
	    	}
	    }
	    System.out.println("Before Removing Duplicates : "+str);
	    System.out.println("Before Removing Duplicates : "+str1);
	}
}
