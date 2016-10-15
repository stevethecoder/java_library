package _06_inputoutput;

import java.util.Scanner;

public class _02_challenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName;
		String alpClass;
		String teacher;
		
		int classWeek = 2;
		
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.println("My name is: ");
		myName = inputInfo.nextLine();
		
		System.out.println("My class is: ");
		alpClass = inputInfo.nextLine();
		
		System.out.println("My teachers are: ");
		teacher = inputInfo.nextLine();
		
		System.out.println("This is week number " + classWeek + " of the course.");
		
		boolean experience = true;
		
		if(experience == false){	
			System.out.println("You need to ask questions.");	
		} else {
			System.out.println("You understand. Go to next exercise.");
		}
		
		System.out.println("Hi, my name is " + myName + " and I am enrolled in " + alpClass + " at Eleven Fifty Academy. My teachers are " + teacher + ".");
		
		inputInfo.close();		
	}

}
