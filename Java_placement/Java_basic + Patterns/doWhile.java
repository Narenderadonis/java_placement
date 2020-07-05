import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=1;
		do {
			n = sc.nextInt();
			System.out.println("the number is"+ n);
		}while(n!=0);

	}

}
