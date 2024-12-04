package stringPrograms;

import java.util.Scanner;

public class EachVowelCount 
{
     public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String str = scan.next();
		 
		int ca=0, ce=0, ci=0, co=0,cu=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			ch = Character.toLowerCase(ch);
			switch(ch)
			{
			case 'a' : ca++;break;
			case 'e' : ce++;break;
			case 'i' : ci++;break;
			case 'o' : co++;break;
			case 'u' : cu++;break;
			}
		}
		if(ca > 0)
		System.out.println("The Vowel 'a' is present "+ca );
		if(ce > 0)
		System.out.println("The Vowel 'e' is present "+ce );
		if(ci > 0)
		System.out.println("The Vowel 'i' is present "+ci );
		if(co > 0)
		System.out.println("The Vowel 'o' is present "+co );
		if(cu > 0)
		System.out.println("The Vowel 'u' is present "+cu );
	} 
}
