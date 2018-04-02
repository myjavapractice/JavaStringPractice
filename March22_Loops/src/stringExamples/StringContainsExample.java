package stringExamples;

public class StringContainsExample {

	public static void main(String[] args) {
		String str1 = "Welcome to Amazon";
		//one way to check contains
		System.out.println("one way to check Contains");
		boolean newstr = str1.contains("Welcome");
		if(newstr == true)
		{
			System.out.println("string has welcome");
		}
		else
		{
			System.out.println("string did not have welcome");
		}
		//another way to check contains
		System.out.println("other way to check Contains");
		String checkStr = "Welcome";
		if(str1.contains(checkStr))
				{
					System.out.println("string has welcome");
				}
				else
				{
					System.out.println("string did not have welcome");
				}
	}

}
