package oops;

public class methodsIntro {

	public static void main(String[] args) {
		int firstnumber=24;
		int secondnumber=35;
		int result=maxof(firstnumber,secondnumber);
		System.out.println(result);
		sayhi();
		sayhi();
	}
	static int maxof(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	static void sayhi() {
		System.out.println("Hii");
		System.out.println("Good Morning");
	}

}
