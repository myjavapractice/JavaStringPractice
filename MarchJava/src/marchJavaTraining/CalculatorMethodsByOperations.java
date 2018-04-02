
package marchJavaTraining;

public class CalculatorMethodsByOperations {

	int fnum, snum,result;
 	void addtion()
 {
	 	result=fnum+snum;
		System.out.println("Sum of 2 numbers: "+result);//comment
		System.out.println("Sum of 2 numbers: "+result);
	 }
   void subtraction()
 {
		result=fnum-snum;
		System.out.println("Difference of 2 numbers: "+result);
	 }
  void multiplication()
 {
    result=fnum*snum;
	System.out.println("multiplication of 2 numbers: "+result);
	}
  void division()
 {
	result=fnum/snum;
	System.out.println("division of 2 numbers: "+result);
 }
  public static void main(String[] args) 
  {
	  CalculatorMethodsByOperations oCal = new CalculatorMethodsByOperations();
	oCal.fnum=6;
	oCal.snum=3;
	oCal.addtion();
	oCal.subtraction();
	oCal.multiplication();
	oCal.division();
	}
}
