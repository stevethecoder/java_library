package _09_loops;

public class _01_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start at zero and count to 10
		int count = 0;
		while(count <=10){
			System.out.println(count);
			count++;
		}
		//add one to above (11)
		System.out.println(count);

		//start at 10 and count backwards
		int countTwo = 10;
		while(countTwo >=0){
			System.out.println(countTwo);
			countTwo--;
		}
		
		//from 100 count backwards by 5s.
		int countThree = 100;
		while(countThree >=0){
			System.out.println(countThree);
			countThree-=5;
		}
	}
}
