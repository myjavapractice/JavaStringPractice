package marchJavaTraining;

import java.util.Scanner;

public class CalcultorUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fnum,snum,result;
		System.out.println("Enter first number:");
		fnum=sc.nextDouble();
<<<<<<< HEAD
		System.out.println("Enter second number:");//comment
=======
		System.out.println("Enter second number:");
>>>>>>> ff9ba963f6ad8094e51414c6d11288b00d643527
		snum=sc.nextDouble();
		result=fnum+snum;
		System.out.println("result:" + result);
	}
}
