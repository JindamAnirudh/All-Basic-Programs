package stringPrograms;

import java.util.*;

public class Anagram 
{
      public static void main(String[] args) 
      {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String1");
		 String s1 = scan.next();
		 System.out.println("Enter the String2");
		 String s2 = scan.next();
		 
		 if(s1.length() == s2.length())
		 {
			 char[] ca1 = s1.toCharArray();
			 char[] ca2 = s2.toCharArray();
			 
			 Arrays.sort(ca1);
			 Arrays.sort(ca2);
			 
			 boolean result = Arrays.equals(ca1, ca2);
			 
			 if(result == true)
			 {
				 System.out.println("Given Strings are Anagram");
			 }
			 else
			 {
				 System.err.println("Given Strings are not an Anagram");
			 }
		 }
		 else
		 {
			 System.err.println("Given Strings are not an Anagram");
		 }
	}
}
