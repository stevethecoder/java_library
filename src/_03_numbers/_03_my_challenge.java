package _03_numbers;

public class _03_my_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Capacity of bookshelves
		
		int capacity = 200;
		
	    
	    //Types of inventory.
	    int fiction = 54;
	    int nonFiction = 71;
	    int magazines = 14;
	    
	    //Calculating inventory.
	    int libraryCollection = fiction + nonFiction + magazines;
	    System.out.println("Current Inventory " + libraryCollection);
	    
	    //Available space.
	    int availableSpace = capacity - libraryCollection; 
	    System.out.println("Available space: " + availableSpace);
	    
	    //True available space.
	    double fictionThickness = 2.5;
		double nonFictionThickness = 5.0;
		double magazinesThickness = 0.5;
		
		double actualFiction = libraryCollection / fictionThickness;
		System.out.println("Available fiction space: " + actualFiction);
		
		double actualNonFiction = libraryCollection / nonFictionThickness;
		System.out.println("Available non-fiction space: " + actualNonFiction);
		
		double actualMagazines = libraryCollection / magazinesThickness;
		System.out.println("Available magazines: " + actualMagazines);
		
		
		
	    		
	 
	    
	}

}
