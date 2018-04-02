package loopsExamples;

public class WhileExample {
	public static void main(String[] args) {
		int iBalance=1025;
		while (iBalance >= 1000)
		{
			System.out.println("Current balance is :"+iBalance);
			iBalance=iBalance-50;
		}
	
	}
}
