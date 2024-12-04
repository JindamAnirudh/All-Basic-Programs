package patternPrograms;

import java.util.Scanner;

public class Pattern13 
{
   public static void main(String[] args) 
   {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value");
		int n = scan.nextInt();
		
		
		int a = 1;
		char ch = 'a';
		for(int i=0; i<n; i++)
		{

			
			for(int j=0; j<n; j++)
			{
				if(j % 2 ==0)
				{
                   System.out.print(a +" ");
				}
				
				else
				{
					System.out.print(ch+" ");
				}
				
			}
			System.out.println();
			
			
				a++;
			
				ch++;
		}	
		
	} 
   
}
