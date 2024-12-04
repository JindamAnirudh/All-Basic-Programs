//WAP to count the numbers between M and N which has number 6 in it
package loopingStatements;

import java.util.Scanner;

public class NumberWhichHas6 
{
	 public static void main(String[] args)
	    {
			 Scanner scan=new Scanner(System.in);
			 System.out.println("Enter the First Value");
			 int m=scan.nextInt();
			 System.out.println("Enter the Last Value");
			 int n=scan.nextInt();
		     int count = 0;
		     for(int i=m; i<=n; i++)
			 {
				 int temp=i;
				 while(temp>0)
				 {
					 if(temp%10 == 6)
					 {
						count++;
						// System.out.print(i+" ");
						 
					 }
					 temp/=10;
					 //break;
				 }
			 }
		     System.out.println("The Numbers Which has number 6 in it Between "+m+" and "+n+" is "+count);
	    }			
}
