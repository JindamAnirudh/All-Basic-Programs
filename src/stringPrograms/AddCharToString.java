package stringPrograms;

import java.util.Scanner;

public class AddCharToString 
{
     public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String str = scan.next();
		 System.out.println("Enter the Index Value");
		 int n = scan.nextInt();
		 System.out.println("Enter the Character");
		 char ch = scan.next().charAt(0);
		 String str1 = "";
		 int count = 0;
		 
		 for(int i = 0;i<=str.length(); i++)//i<str.length()+1
		 {
			 if(i == n)
			 {
				 str1+= ch;
			 }
			 else
			 {
				 str1+=str.charAt(count);
				 count++;
			 }
		 }
		 System.out.println("Before Adding : "+str);
		 System.out.println("After Adding : "+str1);
	}
}
