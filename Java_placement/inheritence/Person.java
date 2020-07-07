package inheritence;

public class Person {
	protected String name;
	public Person(String name) {
		this.name=name;
		System.out.println("inside Person constructor");
	}
	
	public void eat(){
		System.out.println(name +" the person is eating");
	}
	public void walk() {
		System.out.println(name+"the person is walking");
	}

}
