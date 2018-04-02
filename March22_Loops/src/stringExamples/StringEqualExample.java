package stringExamples;

public class StringEqualExample {

	public static void main(String[] args) {
		String str1 = "Welcome to Amazon";
		//one way to check Equal
		System.out.println("one way to check Contains");
		boolean newstr = str1.equals("Welcome");
		if(newstr == true)
		{
			System.out.println("Equal check passed");
		}
		else
		{
			System.out.println("Equal check failed");
		}
		//another way to check contains
		System.out.println("other way to check Contains");
		String str2 = "Welcome";
		String checkStr = "Welcome";
		if(str2.equals(checkStr))
				{
					System.out.println("Equal check passed");
				}
				else
				{
					System.out.println("Equal check failed");
				}
	}

}
