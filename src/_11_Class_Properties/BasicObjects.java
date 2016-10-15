package _11_Class_Properties;

public class BasicObjects {

	public static void main(String[] args) {

		//stevescar is the object or instance of the Car class.
		Car stevescar = new Car();
		stevescar.make = "Toyota";
		stevescar.model = "Camry";
		stevescar.color = "Black";
		stevescar.isFast = true;
		stevescar.mpgCity = 40;
		stevescar.mpgHighway = 45;
		
		System.out.println("I own a " + stevescar.make + " known as a " + stevescar.model + ". It is my favorite color which is " + stevescar.color + ".");
		
		System.out.println("I bought it because of fuel efficiency. I regularly get " + stevescar.mpgCity + " in the city and " + stevescar.mpgHighway + " on the highway.");
		
		
		
		
		
		
	}

}
