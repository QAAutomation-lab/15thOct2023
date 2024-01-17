package day7.staticMethods;

public class Sample06 {

	public static void main(String[] args) {
		//getSimpleInterest(550000, 8.5, 25);//method body will be executed but its return value won't be printed
		//or method body will be executed and its return value will be printed in the console
		//System.out.println("Simple inetrest is: "+getSimpleInterest(550000, 8.5, 25));
		
		double intrest=getSimpleInterest(550000, 8.5, 25);
		System.out.println("Intrest is : "+intrest);
		double finalAmount=550000+intrest;
		System.out.println("Final amount: "+finalAmount);
	}
	static double getSimpleInterest(int p,double r,int t) {
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI: "+r);
		System.out.println("Duration is: "+t);
//		double res=(p*r*t)/100;
//		return res;		
		return (p*r*t)/100;
	}
}

//WAP for
	/*
	 * 1. to check prime number
	 * 2. reverse number
	 * 3. palindrome
	 */
