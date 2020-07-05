import java.util.Scanner;
public class nestedForLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int result =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				result=i*j;
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}

}
