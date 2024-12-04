package stringPrograms;

import java.util.Scanner;

public class NameAndDate 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = scan.nextLine();
		System.out.println("Enter todays Date");
		String date = scan.nextLine();
		String res = name+" "+date;
		
		System.out.println(res);
	}
}
