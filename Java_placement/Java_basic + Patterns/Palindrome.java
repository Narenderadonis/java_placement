import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it is Palindrome or not");
		int n=sc.nextInt();
		int temp=n;
		int reverse=0;
        while(temp>0) {
        	int lastdigit=temp%10;
        	temp=temp/10;
        	reverse=reverse*10+lastdigit;
        }
 
       if(reverse==n) {
        	System.out.println("It is a palindrome number");
        }
        else {
        	System.out.println("It is not a palindrome number");
        }
	}

}
