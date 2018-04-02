import java.util.Scanner;

class March22_LoopIfExample1 {
    public static void main(String[] args) {

    	System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		double testscore = sc.nextDouble();
		//System.out.println("Entered state is : " + sState);
	  //  int testscore = 90;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}