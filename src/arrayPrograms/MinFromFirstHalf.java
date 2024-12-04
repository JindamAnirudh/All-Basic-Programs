package arrayPrograms;

import java.util.Scanner;

public class MinFromFirstHalf 
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
	 int smallest = a[0];
	 for(int i=1; i<a.length/2; i++)
	 {
		 if(smallest > a[i])
		 {
			 smallest = a[i];
		 }
	 }
	 System.out.println("Smallest Value from First Half of an Array is : "+smallest);
  }
}
