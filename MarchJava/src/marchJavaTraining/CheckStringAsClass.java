package marchJavaTraining;

import java.util.Scanner;

public class CheckStringAsClass
{

	static String checkString;
	static int strlen;
	static void checkLength()
	  {
		strlen = checkString.length();
		System.out.println("Length of string entered: " + strlen);	
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		checkString = sc.next();
		checkLength();
	}
}