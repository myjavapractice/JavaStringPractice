package loopsExamples;

public class IfElseWithinIfExample {

	public static void main(String[] args) {
		
		String sCustState="CA";
		int iCustAge=140;
		String sGender = "female";
		if(sCustState == "CA")
		{
			if(iCustAge >= 50 && sGender =="male")
			{
				System.out.println("state is CA and MALE cutomer age is greater than 50");
			}else if(iCustAge >= 50 && sGender =="female")
			{
				System.out.println("state is CA but FEMALE customer age is NOT greater than 50");
			}
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
