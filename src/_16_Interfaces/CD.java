package _16_Interfaces;

public class CD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is stopped.");
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next song.");
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show CD menu.");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("CD is paused.");
		
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("The CD title is " + title);
		
	}

}
