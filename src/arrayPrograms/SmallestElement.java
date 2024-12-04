//WAP to find the Smallest Number in the given Values
package arrayPrograms;

import java.util.Scanner;

public class SmallestElement 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = scan.nextInt();
		
	    int [] arr = new int [size] ;
		
	    System.out.println("Enter the Values");
	    for(int i=0; i<arr.length; i++)
	    {
	    	arr[i]= scan.nextInt();
	    }
	    int smallest = small(arr);
        System.out.println("Smallest element in the array is "+smallest);
    }
	    public static int small(int a[])
	    {
	    	int smallest =a[0];
	 
	    	for(int i=1; i<a.length; i++)
	    {	
	    	if(smallest > a[i])
	    	{
	    		smallest = a[i];
	    	}
	    }
	      return smallest;
	}
}
