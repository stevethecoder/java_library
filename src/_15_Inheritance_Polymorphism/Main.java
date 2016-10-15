package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal george = new Animal ();
		george.name = "George the Animal";
		george.habitat = "Cleveland";
		george.printName();
		george.printHabitat();
		george.getNumTeeth();
		
		Bear barney = new Bear ();
		barney.name = "Barney";
		barney.printName();
		barney.habitat = "Yellowstone";
		barney.printHabitat();
		barney.getNumTeeth();
		
		Kangaroo jack = new Kangaroo ();
		jack.name = "Jack";
		jack.habitat = "Outback";
		jack.printName();
		jack.printHabitat();
		jack.getNumTeeth();
		
		Mouse betty = new Mouse ();
		betty.name = "Betty";
		betty.habitat = "Your shoe!";
		betty.hasWhiskers = false;
		betty.printName();
		betty.printHabitat();
		betty.getNumTeeth();
		
		barney.speak();
		jack.speak();
		betty.speak();
		
		

	}

}
