package _15_Inheritance_Polymorphism;

import java.util.Scanner;
public class Animal {
	Scanner scan = new Scanner(System.in);
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
	//Methods
	public void getNumTeeth(){
		System.out.println("How many teeth does " + name + " have?");
		int numTeeth = scan.nextInt();
		System.out.println(name + " has " + numTeeth + " teeth.");
	}
	public void printName(){
		System.out.println("My name is " + name);
	}
	
	public void printHabitat(){
		System.out.println("Their habitat is: " + habitat);
	}
	
	public void speak(){
		System.out.println("I am an animal");
	}
	
	
	
}