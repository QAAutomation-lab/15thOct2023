package day7.staticMethods;

public class Sample04 {

	public static void main(String[] args) {
		printDetails();
		Sample04.checkEvenOddNumber(15);
		Sample04.checkEvenOddNumber(44);
	}
	//method to print about pune
	static void printDetails() {
		System.out.println("Pune is known for weekends thrills");
		System.out.println("In pune, we have a lot of IT companies");
	}
	//method to check number is even or odd
	static void checkEvenOddNumber(int num) {
		if(num%2==0) {
			System.out.println("Given number is Even: "+num);
		}else {
			System.out.println("Given number is Odd: "+num);
		}
	}
}
