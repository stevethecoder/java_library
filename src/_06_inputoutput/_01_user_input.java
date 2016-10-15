package _06_inputoutput;

import java.util.Scanner;

public class _01_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String birthCity;
		String age;
		
		//Scanner is a Java class - used for User input
		Scanner inputInfo = new Scanner(System.in);

		//setup a simple user input
				
		System.out.println("Enter your name below: ");
		name = inputInfo.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your birth city below: ");
		birthCity = inputInfo.nextLine();
		System.out.println(birthCity);
		
		System.out.println("Enter your age below: ");
		age = inputInfo.nextLine();
		System.out.println(age);
		
		//use concatenation to make a sentence using these inputs
		
		System.out.println("A little about me..." + name + " is my first name and I was born in " +birthCity+ " and I am " + age + " years old.");
		
		inputInfo.close();		
	}

}
