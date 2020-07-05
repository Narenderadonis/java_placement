package oops;
//class vehicle{
//	int wheels;
//	vehicle(){
//		wheels=4;
//	}
//}
//
//public class constructor {
//	constructor(){                                                       //non permeterized constructor
//		System.out.println("the object is created now");
//	}
//
//	public static void main(String[] args) {
//		constructor obj=new constructor();
//		vehicle car=new vehicle();
//		vehicle car2=new vehicle();
//		System.out.println(car.wheels);
//		System.out.println(car2.wheels);
//
//	}


//perametrized constructor
class vehicle{
	int wheels;
	vehicle(int noOfWheels){
		wheels=noOfWheels;
	}
}
public class constructor{
	
   public static void main(String[] args) {
		vehicle car = new vehicle(4);
		vehicle scooty=new vehicle(2);
		System.out.println(car.wheels);
		System.out.println(scooty.wheels);
	}
}

	