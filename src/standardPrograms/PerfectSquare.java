//WAP to check whether given number is Perfect Square or not
package standardPrograms;

import java.util.Scanner;

public class PerfectSquare 
{
    public static void main(String[] args) 
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		
		boolean isCheck = false;
		for(int i=1; i<=n/2; i++)
		{
			if(i*i == n)
			{
			   isCheck = true;
				break;
			}
		}
		     if(isCheck == true)
		     {
		    	 System.out.println(n+" is a Perfect Square");
		     }
		     else
		    	 System.out.println(n+" is not a Perfect Square");
		
	}
}
