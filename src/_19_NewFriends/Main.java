package _19_NewFriends;

public class Main {

	public static void main(String[] args) {

		Friend james = new Friend("James", "Male", 36);
		Friend paul = new Friend("Paul", "Male", 36);
		Friend danielle = new Friend("Danielle", "Female", 29);
		
		paul.getname();
		james.getname();
		danielle.getname();
		james.getgender();
		danielle.getage();
		
		String[] friends = {"James", "Paul", "Steve", "Travis"};
		
		for (String friend : friends) {
			System.out.println(friend);
		}
		

	}

}


