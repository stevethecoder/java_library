package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
		
		Friends user1 = new Friends();
		user1.isOnline = true;
		user1.firstName = "Steve";
		user1.lastName = "Richards";
		user1.age = 60;
		user1.city = "Westfield";
		user1.state = "Indiana";
		
		user1.getisOnline();
		System.out.println(user1.firstName + " " + user1.lastName + " My age is " + user1.age +".");
		System.out.println("I live in " + user1.city + " " + user1.state + ".");
		
	
		Friends user2 = new Friends();
		user2.isOnline = false;
		user2.firstName = "James";
		user2.lastName = "Handshoe";
		user2.age = 36;
		user2.city = "Fishers";
		user2.state = "Indiana";
		
		user2.getisOnline();
		System.out.println(user2.firstName +  " " + user2.lastName + " My age is " + user2.age + ".");
		System.out.println("I live in " + user2.city + " " + user2.state + ".");
	}
}