package arrayPrograms;

import java.util.Scanner;

public class MaxFromSecondHalf 
{
  public static void main(String[] args) 
  {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Size of an Array");
	 int size = scan.nextInt();
	 
	 int a[] = new int[size];
	 System.out.println("Enter the Values");
	 
	 for(int i=0; i<a.length; i++)
	 {
		 a[i] = scan.nextInt();
	 }
	 int biggest = a[a.length-1];
	 for(int i=a.length/2; i<a.length; i++)
	 {
		 if(biggest < a[i])
		 {
			 biggest = a[i];
		 }
	 }
	 System.out.println("Biggest Value from Second Half of an Array is : "+biggest);
  }
}
