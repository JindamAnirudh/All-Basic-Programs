package stringPrograms;

import java.util.Scanner;

public class PrintDuplicates 
{
	 public static void main(String[] args) 
	    {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = scan.next();
		    String str1 = "";
		    String str2 = "";
		    
		    for(int i=0; i<str.length(); i++)
		    {
		    	char ch = str.charAt(i);
		    	
		    	if(str1.indexOf(ch) == -1)
		    	{
		    		str1 += ch;
		    	}
		    	else
		    	{
		    		if(str2.indexOf(ch) == -1)
		    		str2 += ch+" ";
		    	}
		    	
		    }
		    System.out.println("Before Removing Duplicates : "+str);
		    if(str.length() == str1.length())
		    {
		    	System.out.println("There are no Duplicate Characters...!!!");
		    }
		    else
		    System.out.println("After Removing Duplicates : "+str1);
		    if(str2.length()>0)
		    System.out.println("Duplicate Characters are : "+str2);
		}
}
