package day10.constructors;

public class StaticVariable {

	static int age=25,salary;	
	public static void main(String[] args) {
		System.out.println("Age: "+age);//25
		int age=10;
		System.out.println("Local age: "+age);//10
		System.out.println("Global Age: "+StaticVariable.age);//25
		System.out.println("Salary: "+salary);//0
		display();
	}
	static void display() {
		System.out.println("Salary: "+salary);//0
		int salary=25000;//local variable
		System.out.println("Salary: "+salary);//25000
		StaticVariable.salary=salary;
		System.out.println("Static global Salary: "+StaticVariable.salary);//25000
	}	
}

/**
this keyword is an instance of current class
this keyword is used to differentiate non-static global variable and local variable when they have same name
this keyword should used only inside nonstatic method
*/