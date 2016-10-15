package _07_conditionals;

public class _01_switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int whiteCastlesEaten = 0;
		String response;
		
		switch (whiteCastlesEaten){
			case 0:
				response = "You won't regret it.";
				break;
			case 5:
				response = "You know you want some more.";
				break;
			case 10:
				response = "Begin to move towards bathroom.";
				break;
			case 20:
				response = "Two exits...no waiting.";
				break;
			default:
				response = "White Castles for everyone!";
				break;
				
		}
		
		System.out.println(response);
		
		
		
	}

}
