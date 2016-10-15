package _20_Assessment3;

public class Main {
	

	public static void main(String[] args) {
		
		//1 Variables: Create two integer variables. Then, create another variable that stores the value  
	    //of those variables when they are added together. Print the value of that variable to the console.
		
		int a = 37;
		int b = 43;
		
		System.out.println(a+b);
		
		//2 Conditionals: Create an else if statement that considers the speed at which a vehicle is  
	    //moving. Handle at least 3 different speeds.
		
		boolean belowSpeedLimit = true;
		boolean atSpeedLimit = false;
		boolean aboveSpeedLimit = false;
		
		if (belowSpeedLimit) {
			System.out.println("Going slow...Wake up! People are passing you.");
		} else {
			System.out.println("Not going too slow.");
		}

		if (atSpeedLimit) {
				System.out.println("Going speed limit...There's a cop behind you. No problem.");
		} else {
				System.out.println("Speed limit is a reference.");
			}
		
		if (aboveSpeedLimit) {
				System.out.println("Give me more power Scotty...Warp Factor Seven.");
		} else {
				System.out.println("Speed limit is a reference.");
			}
		
		//3 Collections: Create an array of your 4 favorite movies or tv shows. Print the third item in
	    //the array to the console.
		
		String[] favoriteMovies = {"The Last Waltz", "The Great Escape", "The Wizard of Oz", "Casablanca"};
		
		System.out.println(favoriteMovies[2]);
		
		//4 Loops: Create a foreach loop that prints all of the items in the array above.
		
		for(String favoriteMovie : favoriteMovies){
			System.out.println(favoriteMovie);
		}
		
		//5 Loops: Create a for loop that prints from 10 to 1.
		
		for (int i=10; i>=0; i--){
			System.out.println(i);
		}
		
		//7 Objects: Make an object from the Gameshow class and set both    
	    //properties. (Don't use a constructor to do this.) 
		
		GameShow ShowA = new GameShow();
		
		ShowA.name = "The Price is Right";
		ShowA.yearsTV = 55;
		
		GameShow ShowB = new GameShow();
		
		ShowB.name = "The Big Bang Theory";
		ShowB.yearsTV = 12;
		
		System.out.println("The longest running show is " + ShowA.name + ". On the air for " + ShowA.yearsTV + " years.");
		
		System.out.println("Another enjoyable show is " + ShowB.name + ". On the air for " + ShowB.yearsTV + " years.");
		
		
		HomeApplicance stove = new HomeApplicance();
		stove.setType("Whirlpool Hot Air 360");
		stove.setPrice(695);
		
		
		HomeApplicance refrigerator = new HomeApplicance();
		refrigerator.setType("Westinghouse Out of Business Sale ");
		refrigerator.setPrice(1495);
		
		
		//10 Classes: Add 2 getters to the HomeAppliance class: getPrice & getName. getPrice should return price and getName 
		//should return the name. You should also add syso statements inside the methods that print out the variable values to the console.
		
		//12 Classes: Add 1 setter called setPrice. This setter should have a parameter that allows users to update the price of the product.
		
		//13 Objects: Using the constructor, make an object from the HomeAppliance class in the space below. After making the object, 
		//run the getPrice method on that object. Then, run the set price on that product and change the price.
		
		System.out.println("Today's Special: " + refrigerator.getType() + "for only " + "S" + refrigerator.getPrice());
		
		System.out.println("Today's Special: " + stove.getType() + "for only " + "S" + stove.getPrice());
		}
	}
	
	

