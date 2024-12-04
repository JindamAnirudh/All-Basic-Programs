/*WAP to count the numbers between M and N which has number 9 in it
and also print count of 9's*/
package loopingStatements;

import java.util.Scanner;

public class CountBoth9 
{
    public static void main(String[] args) 
    {
    	 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the First Value");
		 int m=scan.nextInt();
		 System.out.println("Enter the Last Value");
		 int n=scan.nextInt();
	     int cN = 0;
	     int c9 = 0;
	     for(int i=m; i<=n; i++)
		 {
			 int temp=i;
			 boolean isPresent = false;
			 while(temp>0)
			 {
				 if(temp%10 == 9)
				 {
					c9++;
					isPresent = true; 
				 }
				 temp/=10;
			 }
			 if(isPresent == true)
			 {
                 cN++;				 
			 }
		 }
	     System.out.println("The count of Numbers : "+cN);
	     System.out.println("The count of 9's : "+c9);
	     
    }			
}

	

