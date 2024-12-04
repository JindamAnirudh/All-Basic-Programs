package arrayPrograms;

import java.util.Scanner;

public class PrintFirstHalfInArray 
{
    public static void main(String[] args) 
    {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Size of an Array");
		 int size = scan.nextInt();
		 
		 int []a = new int[size];
		 System.out.println("Enter the Values");
		 for(int i =0; i<a.length; i++)
		 {
			 a[i] = scan.nextInt();
		 }
		 for(int i =0; i<a.length/2; i++)
		 {
			
			 System.out.println(a[i]);
		 }
		
	}
}
