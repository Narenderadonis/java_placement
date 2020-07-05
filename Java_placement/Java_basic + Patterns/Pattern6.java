import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=1;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(num++ +"  ");
			}
			System.out.println();
		}

	}

}
