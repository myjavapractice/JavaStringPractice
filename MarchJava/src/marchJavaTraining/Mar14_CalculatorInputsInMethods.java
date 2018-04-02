
package marchJavaTraining;

public class Mar14_CalculatorInputsInMethods {

	int result;
 	void addtion(int fnum, int snum)
 {
	 	result=fnum+snum;
<<<<<<< HEAD
		System.out.println("Sum of 2 numbers: "+result);//comment
=======
		System.out.println("Sum of 2 numbers: "+result);
>>>>>>> ff9ba963f6ad8094e51414c6d11288b00d643527
	 }
   void subtraction(int fnum, int snum)
 {
		result=fnum-snum;
		System.out.println("Difference of 2 numbers: "+result);
	 }
  void multiplication(int fnum, int snum)
 {
    result=fnum*snum;
	System.out.println("multiplication of 2 numbers: "+result);
	}
  void division(int fnum, int snum)
 {
	result=fnum/snum;
	System.out.println("division of 2 numbers: "+result);
 }
  public static void main(String[] args) 
  {
	  Mar14_CalculatorInputsInMethods oCal = new Mar14_CalculatorInputsInMethods();
	  oCal.addtion(4, 5);
	  oCal.subtraction(7,2);
	  oCal.multiplication(5,5);
	  oCal.division(2, 1);
	}
}
