package string;

public class stringIntro {

	public static void main(String[] args) {
		String name="naren";
	String anothername=new String("naren");
//		System.out.println(name==anothername);
		System.out.println(name.charAt(0));// use of charAt(index) Function
		
		String name1="My name is Reyansh";
		System.out.println(name1.length());// Use of length() function
		
		
		System.out.println(name1.substring(3));// use of substring(begin index) Function
		
		
		System.out.println(name1.substring(11,18));// use of substring(begin index,end index)
		
		
		
		System.out.println(name1.contains("Reyansh"));//use of contains("") 
		System.out.println(name1.contains("naren"));     //Function
		
		
		System.out.println(name.equals(anothername));//use of equals() Function
		
		System.out.println(name1.isEmpty());// use of isEmpty() Function
		
		
		System.out.println(name1.concat(name));// use of concat(str) Function
		
		System.out.println(name.replace('n','N'));// use of replace('old char','new char') function
		
		String cars="Maruti,honda,Wegnar,Lamborgini,Range Rover,Fortuner"; 
		String allcars[]=cars.split(",");   //Use of split() function
		for(String car:allcars) {     // use for Each
			System.out.println(car);	
		}
		
		
		System.out.println(cars.indexOf('h'));//use of indexOf('') Function
		
		
		
		System.out.println(cars.toLowerCase());// use of toLowerCase() Function
		
		
		System.out.println(cars.toUpperCase());// use of toUpperCase() Function
		
		
		String name2="          VANSH         ";
		System.out.println(name2.trim());

	}

}
