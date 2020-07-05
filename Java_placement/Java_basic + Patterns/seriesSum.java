import java.util.Scanner;
public class seriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			result=result+1/i;
		}
		System.out.println(result);

	}

}
