package stringPrograms;

import java.util.Scanner;

public class RemoveCharFromString 
{
	 public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String str = scan.next();
		 System.out.println("Enter the Index Value");
		 int n = scan.nextInt();
		 char ch = str.charAt(0);
		 String str1 = "";
		 for(int i = 0;i<str.length(); i++)
		 {
			 if(i != n)
			 {
				 str1+=str.charAt(i);
			 }
			
		 }
		 System.out.println("Before Adding : "+str);
		 System.out.println("After Adding : "+str1);
	}
}
