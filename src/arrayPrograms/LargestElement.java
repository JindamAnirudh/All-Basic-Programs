package arrayPrograms;

import java.util.Scanner;

public class LargestElement 
{
     public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the size of Array ");
		 int size = scan.nextInt();
		 
		 int [] arr = new int[size];
		 
		 System.out.println("Enter the Values");
		 for(int i=0; i<arr.length; i++)
		 {
			 arr[i] = scan.nextInt();
		 }
		 int largest =arr[0];
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(largest < arr[i])
			 {
				 largest = arr[i];
			 }
		 }
		  System.out.println("The Largest Element is "+largest);
	}
}
