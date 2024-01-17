package day5.loops;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("*****************************************************");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("*****************************************************");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("*****************************************************");
		for(int i=0;i<5;i++) { //number of rows in pyramid
			for(int j=0;j<=i;j++) {//pattern to be printed
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("**********************************");
		for(char ch='a';ch<'e';ch++) {
			for(char c2='a';c2<=ch;c2++) {
				System.out.print(c2+" ");
			}
			System.out.println();
		}
		System.out.println("**********************************");
		for(char ch='a';ch<'e';ch++) {
			for(char c2='a';c2<=ch;c2++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		System.out.println("*****************************************************");
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
0
01
012
0123
01234
 */












