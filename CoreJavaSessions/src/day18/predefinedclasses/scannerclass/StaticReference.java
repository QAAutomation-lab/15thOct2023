package day18.predefinedclasses.scannerclass;
class Demo {
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}
	Demo() {
		System.out.println("Demo class cons..");
	}
}
public final class StaticReference {
	static void testing() {
		System.out.println("I am testing method of staticreference class");
	}
	static Demo ref=new Demo();
	public static void main(String[] args) {
		System.out.println("########################");
		
		StaticReference.ref.display();
		StaticReference.ref.callMe(456);
		//className.staticRefOfDemo.nonstaticMethodOfDemoClass	

		//Demo d1=new Demo();
		//d1.display();
		//d1.callMe(123);
		
		StaticReference.testing();
		System.out.println("Program ends");
//predefinedclass.staticRefOfPrintStream.nonstaticMethodOfPrintStreamClass
		System.err.println("I am getting printed using 'err' from System class");
	}
}
