
package marchJavaTraining;
import java.util.Scanner;
public class CalculatorDoWhileSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fnum,snum,result;
		char choice;
		do
		{
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.println("5. exit");
		System.out.print("Enter choice:");
		choice=sc.next().charAt(0);
		switch(choice)
		{
		case '1': 
			System.out.print("Enter first number:");
			fnum=sc.nextDouble();
			System.out.print("Enter second number:");
			snum=sc.nextDouble();
			result=fnum+snum;
			System.out.println("Sum of 2 numbers: "+result);
			break;
		case '2': 
			System.out.print("Enter first number:");
			fnum=sc.nextDouble();
			System.out.print("Enter second number:");
			snum=sc.nextDouble();
			result=fnum-snum;
			System.out.println("Difference of 2 numbers: "+result);
			break;
		case '3': 
			System.out.print("Enter first number:");
			fnum=sc.nextDouble();
			System.out.print("Enter second number:");
			snum=sc.nextDouble();
			result=fnum*snum;
			System.out.println("multiplication of 2 numbers: "+result);
			break;
		case '4': 
			System.out.print("Enter first number: ");
			fnum=sc.nextDouble();
			System.out.print("Enter second number:");
			snum=sc.nextDouble();
			result=fnum/snum;
			System.out.println("division of 2 numbers: "+result);
			break;
		case '5': 
			System.out.print("Existing calculator");
			break;
		}
		System.out.println("Thanks for using the calculator..");
		}while(choice !=5);
		
	}

}

