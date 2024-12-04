package stringPrograms;

import java.util.Scanner;

public class RemoveSpacesInitFinalINSentence
{
     public static void main(String[] args) 
     {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scan.nextLine();
		String str1 = " ";
		int k = 0;
		int l = str.length()-1;
		for(int i =0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				k++;
			}
			else
			{
				break;
			}
		}
		for(int x=0; x<str.length(); x++)
		{
			if(str.charAt(l) == ' ')
			{
				l--;
			}
			else
			{
				break;
			}
		}
		for(int j=k; j<=l; j++)
		{
			str1+= str.charAt(j);
		}
		System.out.println(str1);
	}
}
