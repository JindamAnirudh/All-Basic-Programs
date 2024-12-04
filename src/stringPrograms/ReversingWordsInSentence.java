package stringPrograms;

import java.util.Scanner;

public class ReversingWordsInSentence 
{
     public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Sentence");
		 String str = scan.nextLine();
		 String str1 = "";
		 String sarr[]= str.split(" ");
		 
		 for(int i=0; i<sarr.length; i++)
		 {
			 String s = sarr[i];
			 for(int j = s.length()-1; j>=0; j--)
			 {
				 str1+=s.charAt(j);
			 }
				str1 += " " ;
		 }
		 System.out.println("Before Reversing :- "+str);
		 System.out.println("Before Reversing :- "+str1);
	}
}
