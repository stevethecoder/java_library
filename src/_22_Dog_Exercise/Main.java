package _22_Dog_Exercise;

public class Main {

	public static void main(String[] args) {

		Dogs dog1 = new Dogs();
		
		//dog1.name = "Bella";
		dog1.setName("Bella");
		dog1.setColor("black");
		dog1.setType("Pit Bull");
		dog1.setAge(12);
		
		
		//dog1.type = "Pit Bull";
		//dog1.age = 12;
		//dog1.color = "black";
		
		Dogs dog2 = new Dogs();
		//dog2.name = "Chloe";
		//dog2.setName("Chloe");
		//dog2.type = "Pit Bull";
		//dog2.age = 4;
		//dog2.color = "silver";
		
		dog2.setName("Chloe");
		dog2.setColor("silver");
		dog2.setType("Pit Bull");
		dog2.setAge(4);
		
		System.out.println("My oldest dog is named " + dog1.getName() + ". She is a " + dog1.getType() + ". She is " + dog1.getAge() + " years old and " + dog1.getColor() + " in color.");
		
			System.out.println("My second oldest dog is named " + dog2.getName() + ". She is a " + dog2.getType() + ". She is " + dog2.getAge() + " years old and " + dog2.getColor() + " in color.");
		
	}

}
