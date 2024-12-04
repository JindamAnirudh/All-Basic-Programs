package stringPrograms;

import java.util.Scanner;

public class LengthOfString 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scan.nextLine();
		
		System.out.println(str.length());
		
	}
}
