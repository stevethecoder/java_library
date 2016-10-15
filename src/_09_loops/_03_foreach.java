package _09_loops;

public class _03_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] comedians = {"Rodney Dangerfield", "George Carlin", "Robin Williams", "Jonathan Winters"};
		
		for(String comedian : comedians){
			System.out.println(comedian);
		}
		
		String[] greatestBossesofAllTime = {"Jenn Aikins", "Bob Alcorn", "Robin Holer"};
		
		for(String boss : greatestBossesofAllTime){
			System.out.println(boss);
		}
	}
}