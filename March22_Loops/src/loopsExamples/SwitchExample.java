package loopsExamples;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sCustState="VA";
		switch (sCustState)
		{
		case "VA":
			System.out.println("state is VA");
		    break;
		case "TX":
			System.out.println("state is TX");
			break;
		case "NY":
			System.out.println("state is NY");
			break;
		default:
			System.out.println("state is not in the list");
			break;
		}
		
	}

}
