package oops;


class Cat{
	boolean hasFur;
	String color, breed;
	int legs,eyes;
	public void walk()//this is method
	{
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description(){
		System.out.println("my cat has"+legs+"legs and "+eyes+"eyes");
	}
}
class Dog{
	String breed,name;
	public void jump() {
		System.out.println("My dog "+ name +"is jumping");
	}
	public void description() {
		System.out.println("My dog name is " + name + "and it's breed is "+ breed +"."); 
	}
}

public class mainClass {

	public static void main(String[] args) {
		
//		Cat cat1=new Cat();
//		Cat cat2=new Cat();
//		cat1.eyes=2;
//		cat1.legs=4;
//		cat2.legs=5;
//		cat2.eyes=1;
//		cat1.walk();
//		cat2.eat();
//		cat1.description();
//		cat2.description();
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		dog1.name="Huskey";
		dog1.breed="German";		
		dog1.jump();
		dog1.description();

	}

}
