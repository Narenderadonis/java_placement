package string;

public class reverseString2 {

	public static void main(String[] args) {
	String a="i love java,the coffee";
	String[] b= a.split(" ");
	int n=a.length();
	for(int i=3;i>=0;i--) {	
	System.out.print(b[i]+" ");
	}
	}

}
