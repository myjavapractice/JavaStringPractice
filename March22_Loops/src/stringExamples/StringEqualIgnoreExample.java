package stringExamples;

public class StringEqualIgnoreExample {

	public static void main(String[] args) {
		String str1 = "Welcome to Amazon";
		//one way to check EqualIgnoreCase
		System.out.println("one way to check Contains");
		boolean newstr = str1.equalsIgnoreCase("Welcome");
		System.out.println(newstr);
		if(newstr == true)
		{
			System.out.println("Equal check passed");
		}
		else
		{
			System.out.println("Equal check failed");
		}
		//another way to check EqualIgnoreCase
		System.out.println("other way to check Contains");
		String str2 = "Welcome";
		String checkStr = "WelcomE";
		if(str2.equalsIgnoreCase(checkStr))
				{
					System.out.println("Equal check passed");
				}
				else
				{
					System.out.println("Equal check failed");
				}
	}

}
