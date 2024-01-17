package day10.constructors;

public class NonStaticVariable2 {

	int age;	
	void display(int age) {//int age=50;
		System.out.println("age: "+age);
//		NonStaticVariable2 x1=new NonStaticVariable2();
//		System.out.println("NSGV age: "+x1.age);		
		System.out.println("NSGV age: "+this.age);
		this.age=age;
	}
	public static void main(String[] args) {

		NonStaticVariable2 n1=new NonStaticVariable2();	
		System.out.println("NSGV age: "+n1.age);
		n1.display(50);
		System.out.println("NSGV age: "+n1.age);
	}
}

/**
this keyword is an instance of current class
this keyword is used to differentiate non-static global variable and local variable when they have same name
this keyword should used only inside nonstatic method/constructor
*/