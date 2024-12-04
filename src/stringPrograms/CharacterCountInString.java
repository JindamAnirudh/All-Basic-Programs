//WAP to count the how many times the Character present in String
package stringPrograms;

import java.util.Scanner;

public class CharacterCountInString 
{
      public static void main(String[] args) 
      {
		  Scanner scan =  new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scan.next();
		  str = str.toLowerCase();
		  System.out.println("Enter the Character");
		  char ch = scan.next().charAt(0);
		  ch = Character.toLowerCase(ch);
		  
		  int count = 0;
		  
		  for(int i=0; i<str.length(); i++)
		  {
			  if(ch == str.charAt(i))
			  {
				  count++;
			  }
		  }
		  System.out.println("The Character '"+ch+"' is present "+count+" times");
		  
	}
}
