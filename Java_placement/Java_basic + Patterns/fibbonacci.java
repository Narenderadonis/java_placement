import java.util.Scanner;
public class fibbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the fibbonacci series");
		int n=sc.nextInt();
		int fibb=0;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
			fibb=a+b;
			a=b;
			b=fibb;
			System.out.println(fibb);
		}
		
	   

	}

}
