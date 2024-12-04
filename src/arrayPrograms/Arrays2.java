//WAP to Read Values from user and Print
package arrayPrograms;

import java.util.Scanner;

public class Arrays2 
{
   public static void main(String[] args) 
   {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the Size of Array : ");
	 int size = scan.nextInt();
	 
	 int []s = new int[size];
	 
	 System.out.println("Enter the Values");
	 
	 for(int i=0; i<s.length; i++)//s.length = size
	 {
		 s[i] = scan.nextInt();
	 }
	 
	 System.out.println("=========*******========");
	 System.out.println("Values are ");
	 for(int i=0; i<s.length; i++)//s.length = size
	 {
		 System.out.println(s[i]);
	 }
   }
}
