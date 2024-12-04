//WAP to Replace the Character with the New Character
package stringPrograms;

import java.util.Scanner;

public class ReplaceCharacter 
{
     public static void main(String[] args) 
     {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the String");
		  String str = scan.nextLine();
		  System.out.println("Enter the Character to Replace");
		  char ch = scan.next().charAt(0);
		  System.out.println("Enter the Character to Replace With");
		  char ch1 = scan.next().charAt(0);
		 String str1 = " ";
		 
		 str1 = str.replace(ch, ch1);
		 System.out.println("Before Replacing : "+str);
		 System.out.println("After Replacing : "+str1);
	}
}
