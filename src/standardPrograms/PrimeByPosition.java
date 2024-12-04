package standardPrograms;

import java.util.Scanner;

public class PrimeByPosition 
{ 
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Position");
		int pos = scan.nextInt();
		
		int count = 0;
		for(int i=2; i<i+1; i++)
		{
			int num = i;
			boolean isPrime = true;
			for(int j=2; j<num; j++)
			{
				if(num % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime == true)
			{
				count++;
			}
			if(count == pos)
			{
				System.out.println("The Number '"+num+"' is present in position '"+pos+"'");
				break;
			}	
		}
    }
}
