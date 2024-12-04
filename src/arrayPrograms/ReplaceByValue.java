package arrayPrograms;

import java.util.Scanner;

public class ReplaceByValue 
{
    public static void main(String[] args) 
    {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Size of an Array");
		 int size = scan.nextInt();
		 
		 int [] a = new int[size];
		 
		 System.out.println("Enter the Values");
		 for(int i=0; i<a.length; i++)
		 {
			 a[i] = scan.nextInt();
		 }
		 int k = 3;
		 while(k>0)
		 {
			 System.out.println("Enter the Value to Replace");
			 int value = scan.nextInt();
			 System.out.println("Enter Index Size to Replace it");
			 int is = scan.nextInt();
			 boolean isPresent = false;
			 for(int i=0; i<a.length; i++)
			 {
				 if(value == a[i])
				 {
					 isPresent =true;
					 break;
				 }
			 }
			 if(isPresent == true)
			 {
				 a[is] = value;
			 }
			 else
			 {
				 System.out.println("Value is not Present......!!!");
			 }
			 k--;
			 System.out.println("You Still Have "+k+" chances left");
		 }
		 System.out.println("After Replacing");
		 {
			 for(int i=0; i<a.length; i++)
			 {
				 System.out.print(a[i]+" ");
			 }
		 }
	}
}
