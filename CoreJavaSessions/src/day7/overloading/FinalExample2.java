package day7.overloading;

public class FinalExample2 {

	public static void main(String[] args) {
		final int age;
		
		age=25;
		System.out.println(age);
		age=25;
		System.out.println(age);
		age=50;
		System.out.println(age);
	}
}
/**
when we want a fix value for a variable we declared them as final, mean once a
variable is declared as final its value can;t be change later

Local final variable: it can be declared and value can be assigned later
*/