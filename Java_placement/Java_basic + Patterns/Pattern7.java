import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int rows=(n*2)-1;
		for(int i=1;i<=rows;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
			        System.out.print("* ");
			}
			}
			else {
				for(int k=1;k<=rows-i+1;k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		

	}

}
}