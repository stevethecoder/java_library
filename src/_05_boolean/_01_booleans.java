package _05_boolean;

public class _01_booleans 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean tired = false;
		System.out.println(tired);
		System.out.println(2>1);
		System.out.println(1>3);
		
		boolean isRunning = false;
		boolean isLoggedIn = true;
		
		//true is true
		System.out.println(isLoggedIn);
		
		//false is same as not true
		System.out.println(!isRunning);
		

		if(isRunning == false){	
			System.out.println("time to find a mechanic");	
		} else {
			System.out.println("thank God the car is still running");
		}
		
		if (isRunning == true){	
			System.out.println("time to find a mechanic");	
		} else {	
			System.out.println("thank God the car is still running");
		}
		
		//String1 == String2 would not work.
        //Instead, we do String1.equals(String 2)

        String wordOne = "Cat";
        String wordTwo = "Dog";
        String wordThree = "Cat";

        System.out.println(wordOne.equals(wordTwo));
        System.out.println(wordOne.equals(wordThree));
        System.out.println(wordOne == wordTwo);
        
        String password = "Let me In!";
        if (password.equals("I'm not sure")){
        	System.out.println("log in complete");
        } else {
        	System.out.println("please try again");
        }
	}
}