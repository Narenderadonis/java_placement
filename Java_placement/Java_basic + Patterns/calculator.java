import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int result =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		switch(operation) {
		case '+':
			result=a+b;
			System.out.println(result);
			break;
		case '-':
			result=a-b;
			System.out.println(result);
			break;
		case '*':
			result=a*b;
			System.out.println(result);
			break;
		case '/':
			result=a/b;
			System.out.println(result);
			break;
		default:
			System.out.println("Enter correct operation");
		}

	}

}
