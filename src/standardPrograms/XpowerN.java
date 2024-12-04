//WAP to print X Power N
package standardPrograms;

import java.util.Scanner;

public class XpowerN 
{
    public static void main(String[] args) 
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Base Number");
		int x=scan.nextInt();
		System.out.println("Enter the Power Number");
		int n=scan.nextInt();
		
		int power=1;
		
			for(int i=1; i<=n;i++)
			{
				power*=x;
			}
		System.out.println(x+" to the power "+n+" is "+power);
	}
}
