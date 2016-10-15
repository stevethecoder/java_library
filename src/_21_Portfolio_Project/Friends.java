package _21_Portfolio_Project;

public class Friends {
	
	public String firstName;
	
	boolean isDone;
	boolean isNext;
	
	
	public void getisDone() {
		if (isDone){
			System.out.println(firstName + " is done.");
		}else;
	
	}
	
	public void getisNext() {
		if (isNext){
			System.out.println(firstName + " you're next. GOOD LUCK!");
		}else;
			System.out.println(firstName + " not yet.");
	}

}
