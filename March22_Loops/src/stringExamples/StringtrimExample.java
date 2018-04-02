package stringExamples;

public class StringtrimExample {

	public static void main(String[] args) {
		String str1 = "Welcome to Amazon    ";
		//one way to check contains
		System.out.println("one way to check trim");
		String newstr =str1.trim();
		System.out.println(newstr);
		if(newstr.contains("Welcome to Amazon"))
		{
			System.out.println("string has welcome");
		}
		else
		{
			System.out.println("string did not have welcome");
		}
		//another way to check contains
		System.out.println("other way to check Contains");
		String str2="Welcome  ";
		String checkStr = "Welcome";
		if(checkStr == str2.trim())
				{
					System.out.println("string has welcome");
				}
				else
				{
					System.out.println("string did not have welcome");
				}
	}

}
