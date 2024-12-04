package stringPrograms;

import java.util.Scanner;

public class ReversingAtSamePosition 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scan.nextLine();
		String result = " ";
		
		char ch[] = str.toCharArray();
		
		int start = 0;
		int last = ch.length-1;
		
		while(start < last)
		{
			char startChar = ch[start];
			char lastChar = ch[last];
			
			if(startChar == ' ')
			{
				start++;
			}
			else if(lastChar == ' ')
			{
				last--;
			}
			else
			{
				char temp = ' ';
				temp = startChar;
				ch[start] = lastChar;
				ch[lastChar] = temp;
				
				start++;
				last--;
			}
		}
		result = new String(ch);
		
		System.out.println(result);
	}
}
