package arrayPrograms;

import java.util.Scanner;

public class EvenIndexes 
{
   public static void main(String[] args) 
   {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the Size of Array");
      int size = scan.nextInt();
      
      char [] ch = new char[size];
      System.out.println("Enter the Values");
      for(int i=0; i<ch.length; i++)
      {
         ch[i] = scan.next().charAt(0);
      }
      
      System.out.println("The Values are");
      for(int i=0; i<ch.length; i++)
      {
    	  if(i%2 == 0)
    	  {
    		  System.out.println(ch[i]);
    	  }
      }
	  
}
}
