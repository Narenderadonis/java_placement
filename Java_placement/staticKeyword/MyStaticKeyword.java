package staticKeyword;
import staticKeyword.person.A;
import staticKeyword.person.B;

public class MyStaticKeyword {
	
	public static void main(String[] args) {
		
		person objA=new person();
		A objB= objA.new A();     //to make a object of A we have to make the object of the person first. 
		
		B objC = new person.B();// but if we use static keyword than we can directly make the object of B.

	}

}
