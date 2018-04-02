package loopsExamples;

public class WhileDoExample {

	public static void main(String[] args) {
		int iBalance=1025;
		do
		{
			System.out.println("Current Balance is: "+iBalance);
			iBalance = iBalance-50;
		}
		while (iBalance >= 1000);
		}

}
