package stringExamples;

public class StringConcatExampls {

	public static void main(String[] args) {
		String str1 = "Welcome to Amazon";
		String str2 = "Thanks for ordering goods via amazon";
		//String sPrice = "123";
		String newstr = str1.concat(" ... ");
		String finalstring = newstr.concat(str2);
		System.out.println("Concatinated new string " + finalstring);
		}

}
