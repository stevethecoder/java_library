package _12B_Movies_Challenge_Constructor;

public class BasicObjects {

	public static void main(String[] args) {
				
		//Movies WizardOfOz = new Movies("Wizard of Oz", "Victor Fleming", "Ray Bolger", "Billie Burke", 1939, 112);
		
		Movies x = new Movies("Wizard of Oz", "Victor Fleming", "Ray Bolger" , "Billie Burke", 1939, 112);
		System.out.println(x.mtitle);
		System.out.println("Directed by " + x.mdirector);
		System.out.println("Co-starring " + x.mactor + " as the Scarecrow.");
		System.out.println("Co-starring " + x.mactress + " as the Good Witch.");
		System.out.println(x.myear + " was a great year for movies.");
		System.out.println("The runtime for this movie is " + x.mlength + " minutes.");
	}
}
