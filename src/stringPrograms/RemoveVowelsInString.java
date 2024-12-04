package stringPrograms;

import java.util.Scanner;

public class RemoveVowelsInString 
{
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str = scan.next();
	   String str1 = " ";
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   char ch= str.charAt(i);
		   ch = Character.toLowerCase(ch);
		   if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' )
		   {
			   str1 += ch;
		   }
	   }
	   System.out.println("Before Removing Vowels");
	   System.out.println(str);
	   System.out.println("************************************");
	   System.out.println("After Removing Vowels");
	   System.out.println(str1);
   }
}
