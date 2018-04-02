import java.util.Scanner;

public class March22_LoopsIfElseExample {

	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String sState = sc.next();
		System.out.println("Entered state is : " + sState);
		if (sState=="CA")
			{
				System.out.println("state tax for " +sState + " is 10%");
			}
		else if (sState=="TX")
		{
			System.out.println("state tax for " +sState + " is 8%");
		}else
		{
			System.out.println("Entered state " +sState + " doesnt have tax");
		}
	}
}
