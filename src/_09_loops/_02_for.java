package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loop that starts at zero, goes to 100, by 5s.
		
		for(int i = 0; i <= 100; i+=5) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum = sum + 1;
			System.out.println(sum);

		}

		int sum1 = 0;
		for(int i = 0; i <= 10; i++) {
			sum1 = sum1 + i;
			System.out.println(sum1);

		}
		
		int sum2 = 0;
		for(int i = 0; i <= 10; i++) {
			sum2 = sum1 + sum1;
			System.out.println(sum2);

		}
		
		double balance = 5000;
		double rate = 1.02;
		
		for(int i=1; i <= 10; i++){
			balance *= rate;
			System.out.println(balance);
			
			String spaces = "There are spaces in this string.";
			int numSpaces = 0;
			
			for(int i1=0; i1 < spaces.length(); i1++) {
				if (spaces.charAt(i1) == ' '){
					numSpaces++;
					
				} else {
					continue;
				}
			}
			System.out.println("There are " + numSpaces + " spaces in your string.");
		}
		
	}

}
