package stringPrograms;

import java.util.Scanner;

public class CountExcludeSpace 
{
    public static void main(String[] args) 
    {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Sentence");
		 String str = scan.nextLine();
		 
		 int count = 0;
		 for(int i=0; i<str.length(); i++)
		 {
			 char ch = str.charAt(i);
			 ch = Character.toLowerCase(ch);
			 if(ch != ' ')
			 {
				 count++;
			 }
		 }
		 System.out.println("Character count Excluding Spaces is : "+count);
	}
}
