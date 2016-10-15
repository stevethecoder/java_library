package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TODO Create a CD and a DVD object.
		//Call some of the methods on those objects.
		
		CD zeppelin = new CD();
		zeppelin.play();
		zeppelin.skip();
		
		DVD beaches = new DVD();
		beaches.play();
		beaches.stop();
		beaches.turnUpToEleven();
		
		BluRay blackSheep = new BluRay();
		blackSheep.play();
		blackSheep.menu();
		
		zeppelin.getTitle("Physical Graffiti");
		beaches.getTitle("Beaches");
		blackSheep.getTitle("Black Sheep");
	}

}
