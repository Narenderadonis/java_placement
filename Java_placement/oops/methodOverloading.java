package oops;

public class methodOverloading {

	public static void main(String[] args) {
		int firstnumber=23;
		int secondnumber=34;
		int thirdnumber=45;
		int result=maxof(firstnumber,secondnumber);
		//result=maxof(firstnumber,secondnumber,thirdnumber);
	    //result=maxof(firstnumber,secondnumber);
	    System.out.println(result);

	} 
	static int maxof(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int maxof(int a,int b,int c) {
		if(a>b) {
			return a;
		}
		else if(a>c) {
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	static float maxof(float a,float b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
