package day7.staticMethods;

public class Sample03 {

	static void calling(int num) {
		System.out.println("you are calling to "+num);
		System.out.println("Phone is ringing.....");
	}
	public static void addition() {
		int num1=10,num2=20,res;
		res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Sum: "+res);
	}
	public static void additionOfTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Sum of two numbers: "+res);
	}
	public static void main(String[] args) {
		System.out.println("Program started");
		additionOfTwoNumber(50, 70);
		Sample03.additionOfTwoNumber(120, 80);
		addition();		
		calling(123);
		System.out.println("******************Tell me about yourself?************");
		Sample03.calling(456);
		addition();
		System.out.println("##############I am Software tester####################");
		calling(789);
		addition();
		System.out.println("Program ends");
	}
}
/*
Parameterized method: when we want to execute a method with diff values dn we use parameter concept


any variable or method declared with static keyword known as static member
static members are also known as class member because they are loaded in the memory at the time compilation 
when .class file is getting generated

Access:
	1. we can access any static member from another static method directly
	2. we can also use classname to access them
They will have a single memory allocation or one time memory allocation
*/