package _16_Interfaces;

public class DVD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play movie.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD is stopped.");
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next movie.");
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Go to movie menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is paused");
		
	}

	public void turnUpToEleven() {
		// TODO Auto-generated method stub
		System.out.println("Play it LOUD!");
		
	}
	
	public void subtitles() {
		String subtitles = null;
		// TODO Auto-generated method stub
		System.out.println(subtitles + "Espanol");
		
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("The DVD title is " + title);
		
	}

}
