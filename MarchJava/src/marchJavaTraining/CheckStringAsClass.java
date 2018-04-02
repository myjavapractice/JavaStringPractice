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
<<<<<<< HEAD
		System.out.print("Enter the string: ");//comment
=======
		System.out.print("Enter the string: ");
>>>>>>> ff9ba963f6ad8094e51414c6d11288b00d643527
		checkString = sc.next();
		checkLength();
	}
}