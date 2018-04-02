import java.util.Scanner;

public class CopyOfMarch22_LoopsIfElseExample {

	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String sState = sc.next();
		System.out.println("Entered state is : " + sState);
		String inState =sState;
		System.out.println(sState);
		if (inState=="CA") {System.out.println("state tax for " +inState + " is 10%");}
		else if (inState=="TX") {System.out.println("state tax for " +inState + " is 9%");} 
		else if (inState=="VA") {System.out.println("state tax for " +inState + " is 8%");}
		else if (inState=="NY") {System.out.println("state tax for " +inState + " is 7%");} 
		else {System.out.println("if didnot work at all");
        }
    }
}




