package staticKeyword;

public class StaticBlock {
	static {
		System.out.println("this is static block 1");
	}
	static {
		System.out.println("this is static block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("this is inside main function");

	}
	static {
		System.out.println("this is static block 3");
	}

}
