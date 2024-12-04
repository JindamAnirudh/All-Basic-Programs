package stringPrograms;

import java.util.Scanner;

public class RemoveSpacesInSentence 
{
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the Sentence");
	   String str = scan.nextLine();
	  // String str1[] = str.split(" ");
	   String str2=str.replace(" ", "");
	   
	  /* for(int i=0; i<str1.length(); i++)
	   {
		   str2+= str1[i];
	   }*/
	   System.out.println("Before Removing Spaces : "+str);
	   System.out.println("After Removing Spaces : "+str2);
   }
}
