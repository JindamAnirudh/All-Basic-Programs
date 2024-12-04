package stringPrograms;

import java.util.Scanner;

public class VowelsInString 
{
        public static void main(String[] args) 
        {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = scan.next();
			int count = 0;
			
			for(int i=0; i<str.length(); i++)
			{
				char ch = str.charAt(i);
				
				switch(ch)
				{
				case 'a' :
				case 'A' :
				case 'e' :
				case 'E' :
				case 'i' :
				case 'I' :
				case 'o' :
				case 'O' :
				case 'u' :
				case 'U' :count++;
				System.out.print(ch+",");
				}		
			}
			System.out.println(" \n Vowels Count is : "+count);
		
		}
}
