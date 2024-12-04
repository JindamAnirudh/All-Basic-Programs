package stringPrograms;

import java.util.Scanner;

public class LargestSubString 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scan.nextLine();
		String sarr[] = str.split(" ");
		
		int largeSub = sarr[0].length();
		int temp = 0;
		
		for(int i=1; i<sarr.length; i++)
		{
			if(largeSub < sarr[i].length())
			{
				largeSub = sarr[i].length();
				temp = i;
			}
		}
		System.out.println("Length of Largest SubString is : "+largeSub);
		System.out.println(" Largest SubString is : "+sarr[temp]);
	}
}
