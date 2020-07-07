package encapsulation;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.println("you are too old to became a student");
		}
		else {
		this.age=age;
	}
	}
	

}
