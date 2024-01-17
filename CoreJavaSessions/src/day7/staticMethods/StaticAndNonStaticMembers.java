package day7.staticMethods;

public class StaticAndNonStaticMembers {
	static double res;
	int num1=25;
	void areaOfSquare() {
		int s=10;
		int area=s*s;
		System.out.println("Side is: "+s);
		System.out.println("Area of square: "+area);
	}
	static boolean checkEvenOdd(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		StaticAndNonStaticMembers ref=new StaticAndNonStaticMembers();
		System.out.println("NSGV num1: "+ref.num1);
		ref.areaOfSquare();
		
		System.out.println("SGV res: "+res);
		//checkEvenOdd(25);
		//System.out.println("is 25 even? "+checkEvenOdd(25));
		boolean res=checkEvenOdd(25);
		System.out.println("result: "+res);
	}

}
