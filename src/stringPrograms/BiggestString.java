package stringPrograms;
public class BiggestString 
{
     public static void main(String[] args) 
     {
		 String[] s1 = { "orange","blue","yellow","pink","red"};
		 String biggest = s1[0];
		 
		 for(int i=1; i<s1.length; i++)
		 {
			 if(s1[i].compareTo(biggest) > 0)
			 {
				 biggest = s1[i];
			 }
		 }
		 System.out.println("Biggest String is : "+biggest);
	} 
}
