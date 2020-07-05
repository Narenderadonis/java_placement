import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find if it is prime or not");
		boolean isprime=true;
		int n =sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=false;
				break;
				
			}
			
		}
		if(n<2) {
			isprime=false;
		}
		System.out.println(isprime);
	}

}
