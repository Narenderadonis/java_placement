package inheritence;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constractor");
	}
	
	
	public void teach() {
		System.out.println(name+ "the teacher is teaching");
	}
	public void eat(){      // method overriding 
		
		
		super.eat();  //super keyword is used to access parent class from child class 
		
		System.out.println("teacher "+ name +"  is eating");
	}

}
