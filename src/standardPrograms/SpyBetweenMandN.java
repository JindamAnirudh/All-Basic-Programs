package standardPrograms;

import java.util.Scanner;

public class SpyBetweenMandN 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the M value");
		int m = scan.nextInt();
		System.out.println("Enter the N value");
		int n = scan.nextInt();
		
		for(int i=m; i<=n; i++)
		{
			if(spy(i) ==  true)
			{
				System.out.println(i+" is a Spy Number");
			}
		}
    }
		public static boolean spy(int a)
		{
			int sum = 0;
			int prod = 1;
			while(a > 0)
			{
				int temp = a % 10;
				sum += temp;
				prod *= temp;
				a /= 10;
			}
			if(sum == prod)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
