package _13_Friends;

public class Friends {
	
	String firstName;
	String lastName;
	String city;
	String state;
	int age;
	public boolean isOnline;
	
	
	public void getisOnline() {
		if (isOnline){
			System.out.println(firstName + " is online.");
		}
		else {
			System.out.println(firstName + " is not online.");		
		}
	}
}

		
	