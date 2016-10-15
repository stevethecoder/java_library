package _16_Interfaces;

public class BluRay implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play BluRay movie");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BluRay is stopped.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next BluRay movie.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Go to BluRay movie menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("BluRay is paused");
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("The BluRay title is " + title);
		
	}

}
