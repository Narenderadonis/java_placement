package oops;

public class passByValue {

	public static void main(String[] args) {
		int c=20;
		int d=30;
		swap(c,d);
		System.out.println(c+"    "+d);
		//System.out.println(a+"    "+b);
		

	}
	static void swap(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"    "+b);
	}

}
