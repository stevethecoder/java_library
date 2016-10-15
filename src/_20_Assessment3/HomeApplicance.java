package _20_Assessment3;

//8 Classes: Make another class called HomeAppliance. Make 2 private properties: type and price.  Make those properties private.

public class HomeApplicance {
	private String type;
	private double price;
	
//9 Classes: Create a constructor that allows HomeAppliance objects to be created. The constructor should use both of the variables above.

		public String setType (String paramType ){
			type = paramType;
			return type;
		}
		
		public String getType (){
			return type;
		}
		
		public double setPrice (double paramPrice ){
			price = paramPrice;
			return price;
		}
		
		public double getPrice (){
			return price;
		}
	
}
