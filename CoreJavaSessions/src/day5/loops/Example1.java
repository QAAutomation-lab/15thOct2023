package day5.loops;

public class Example1 {

	public static void main(String[] args) {
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		System.out.println("Hello, Good Morning Everyone");
//		
		for(int i=1;i<=10;i++) {
			System.out.println(i+ " Hello, Good Morning Everyone");
		}
		System.out.println("********Number between 1 to 10 *****************");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("********Number between 10 to 1 *****************");
		for(int i=10;i>=1;--i) {
			System.out.println(i);
		}
		System.out.println("********Print odd Number between 1 to 50 *****************");
		for(int i=1;i<=50;i++) {
			if(i%2!=0) {
				System.out.println("Number is odd: "+i);
			}
		}
		System.out.println("*************************************************");
		char c1='A',c2='a';
		System.out.println("C1: "+c1);
		System.out.println("C2: "+c2);
		int n1=c1,n2=c2;
		System.out.println("'A' ASCI value is: "+n1);
		System.out.println("'a' ASCI value is: "+n2);
		System.out.println("**************Print A to Z **************************");
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
		System.out.println("**************Print Z to A **************************");
		for(char ch='Z';ch>='A';ch--) {
			System.out.println(ch);
		}
		
		System.out.println("**************Print a to z **************************");
		
		System.out.println("**************Print z to a **************************");
		
		System.out.println("**************Print vowels between a to z **************************");
		for(char ch='A';ch<='Z';ch++) {
			if(ch=='A' || ch=='E' ||ch=='I'||ch=='O'||ch=='U' ) {
				System.out.println(ch + " : is vowel");
			}
		}
		System.out.println("*****************************************************");
		for(int i=0;i<5;i++) {
			System.out.println("value from 1st for loop: "+i);
			for(int j=0;j<3;j++) {
				System.out.println("\tvalue from inner for loop: "+j);
			}
		}	
		System.out.println("*****************************************************");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			System.out.print("\t");
			for(int j=0;j<3;j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
}
/*
0
	012
1
	012
2
	012
 */












