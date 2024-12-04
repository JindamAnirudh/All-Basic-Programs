package arrayPrograms;

import java.util.Scanner;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the size of an array");
		 int size = scan.nextInt();
		 
		 int a[] = new int[size];
		 
		 System.out.println("Enter the Values");
		 for (int i = 0; i < a.length; i++) 
		 {
			a[i] = scan.nextInt();
		}
		 //Sorting
		 for (int i = 0; i < a.length-1; i++) 
		 {
			 int pos = i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[pos] > a[j])
				{
					pos = j;
				}
			}
			if(i != pos)
			{
				int temp = a[i];
				a[i] = a[pos];
				a[pos] = temp;
			}
		}
		 //Print
		 for (int i = 0; i < a.length; i++) 
		 {
			 System.out.print(a[i]+" ");
		}
		 
	}
}
