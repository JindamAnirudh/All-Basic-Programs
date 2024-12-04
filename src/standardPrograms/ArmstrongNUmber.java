//WAP to check whether given number is Armstrong number or not
package standardPrograms;

import java.util.Scanner;

public class ArmstrongNUmber 
{
     public static void main(String[] args) 
     {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num = scan.nextInt();
		 int temp = num;
		 int n = num;
		 
		 int count = 0;
		 int sum = 0;
		 while(num > 0)
		 {
			 count++;
			 num/=10;
		 }
		 while(n>0)
		 {
		 int prod = 1;
         
		 for(int i=0; i<=count; i++)
         {
        	prod*=n%10;
         }
         sum+=prod;
         n/=10;
		 }
		 if(sum == temp)
		 {
			 System.out.println(temp+" is an ArmStrong Number");
		 }
		 else
			 System.out.println(temp+" is not an ArmStrong Number");
	 }
}
