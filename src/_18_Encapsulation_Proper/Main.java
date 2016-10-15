package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {

		Player james = new Player("James", "Badass", 1000000, "Critical");
		Player paul = new Player("Paul", "Straight Up Boss", 2000000, "Questionable");
		Player steven = new Player("Steven", "The King", 3000000, "Superman");
		
		paul.getName();
		james.getstatus();
		steven.gethighScore();
		paul.gethealthPoint();
		
		paul.setNewPlayerName("Paul O'Connor");
		paul.getName();
		
	
	}

}

