package day7.overloading;

public class FinalExample3 {
	final static int empId=101;
	//final static double salary;// we will get compile time error as final variable value should initialize at declaration time
	final int pinCode=41105;
	public static void main(String[] args) {
		final int age;		
		age=25;
		System.out.println(age);
		System.out.println("EmpId: "+empId);
		//empId=201;//Compile time error: as this variable is declared as final,hence its value can't be change
		FinalExample3 f1=new FinalExample3();
		System.out.println(f1.pinCode);
	}
}
/**
when we want a fix value for a variable we declared them as final, mean once a
variable is declared as final its value can;t be change later

Local final variable: it can be declared and value can be assigned later

Global final variable: its mandatory to initialize final global variable at time 
of declaration.

*/