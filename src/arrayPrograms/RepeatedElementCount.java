package arrayPrograms;

import java.util.Scanner;

public class RepeatedElementCount 
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
		 
		 int totalCount = 0;
		 
		 for(int i=0; i<a.length; i++)
		 {
			 int eachDigit = 0;
			 for(int j=i; j>=0; j--)
			 {
				 if (a[i] == a[j])
				 {
			       eachDigit++;
				 }		 
			 }
			 if(eachDigit == 1)
			 {
				 totalCount++;
			 }
		 }
		 int a1[] = new int[totalCount];
		 int index = 0;
		 for (int i = 0; i < a.length; i++) 
		 {
			int outerIndex = a[i];
			boolean isPresent = false;
			for (int j = 0; j < a1.length; j++) 
			{
				int innerIndex = a1[j];
				if(outerIndex == innerIndex)
				{
					isPresent = true;
					break;
				}
			}
			if(isPresent == false)
			{
				a1[index] = outerIndex;
				index++;
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			int count = 0;
			int temp = a1[i];
			for (int j = 0; j < a.length; j++) 
			{
				if(temp == a[j])
				{
					count++;
				}
			}
			System.out.println("Number "+temp+" is repeated "+count+" times....!!!");
		}
  }
}
