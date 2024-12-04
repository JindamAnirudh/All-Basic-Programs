/*WAP to print the Numbers Between M and N,in which the 
 number 5 is Present in it*/
package loopingStatements;

import java.util.Scanner;

public class NumbersWhichHas5 
{
    public static void main(String[] args)
    {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the First Value");
		 int m=scan.nextInt();
		 System.out.println("Enter the Last Value");
		 int n=scan.nextInt();
		// int count=0;
		 for(int i=m; i<=n; i++)
		 {
			 int temp=i;
			 while(temp>0)
			 {
				 if(temp%10 == 5)
				 {
					// count++;
					 System.out.print(i+" ");
					 break;
				 }
				 temp/=10;
			 }
		 }
		// System.out.println("The Numbers Which has number 5 in it Between "+m+" and "+n+" is "+count);
	}
}
