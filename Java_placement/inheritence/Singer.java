package inheritence;

public class Singer extends Person {
	
	public void sing() {
		System.out.println(name + "the singer is singing");
	}
	public void eat(){        //Method overriding
		System.out.println("singer "+ name +" the person is eating");
	}

}
