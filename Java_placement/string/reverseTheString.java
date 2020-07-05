package string;

public class reverseTheString {

	public static void main(String[] args) {
		String a="i love java,the coffee";
		int n=a.length();
		String reverse="";
		//String b[]=new String[n];
		for(int i=n-1;i>=0;i--) {
			reverse=reverse+a.charAt(i);
			
		}
		System.out.println(reverse);


	}

}
