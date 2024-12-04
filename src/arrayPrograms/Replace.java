package arrayPrograms;

import java.util.Scanner;

public class Replace 
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
		 int k =2;
		 while(k >0)
		 {
			 System.out.println("Enter the Index Value to Replace");
			 int index = scan.nextInt();
			 
			 System.out.println("Enter the New Value");
			 a[index] = scan.nextInt();
			 k--;
			 System.out.println("You have "+k+" chances Left to Replace...!!!");                       
		 }
		 System.out.println("After Replacing.....!!!!");
		 for(int i=0; i<a.length; i++)
		 {
			 System.out.print(a[i]+ " ");
		 }
	}
}
