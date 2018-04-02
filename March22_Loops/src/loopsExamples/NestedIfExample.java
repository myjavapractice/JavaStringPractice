package loopsExamples;
public class NestedIfExample {
	public static void main(String[] args) {
		
		String sCustState="VA";
		if(sCustState == "CA")
		{
			System.out.println("state is CA");
			}
		else if(sCustState == "NY")
		{
			System.out.println("state is NY");
		}
		else if(sCustState == "VA")
		{
			System.out.println("state is VA");
		}
		else
		{
			System.out.println("state is not matching");
		}
			
	}

}
