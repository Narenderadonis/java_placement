class vehicle{
    int wheels;
    int headlight;
    String color;
//	vehicle(){                //non-perameterized constractor
//		wheels=4;
//		}
//    vehicle(int numberOfWheels){     //perameterized constractor
//    	wheels=numberOfWheels;
//    	int headLights=2;
//    }
       vehicle(int wheels){       // Use of this keyword
    	   this.wheels=wheels;
       }
       vehicle(int wheels,String color){   // constractor overloading
    	   this.wheels=wheels;
    	   this.color= color;
    	   headlight=2;
    	   
       }
		
	}
public class MyConstractorExcerise {

	public static void main(String[] args) {
		vehicle car = new vehicle(4);
		vehicle scooty=new vehicle(2);
		vehicle eRikshaw=new vehicle(3,"Yellow");
		System.out.println(eRikshaw.wheels+" wheels " + eRikshaw.color +" Color");
		//car.wheels=4;
		System.out.println(car.wheels);
		System.out.println(scooty.wheels);

	}

}
