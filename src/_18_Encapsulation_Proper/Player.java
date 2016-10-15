package _18_Encapsulation_Proper;

public class Player {
	private String name;
	private String status;
	private int highScore;
	private String healthPoint;
	
	//Constructor
	public Player(String name, String status, int highScore, String healthPoint){
		this.name = name;
		this.status = status;
		this.highScore = highScore;
		this.healthPoint = healthPoint;
	}
	
	//Getters
	public String getName(){
		return name;
	}
		
	public String getstatus(){
		return status;
	}
	
	public int gethighScore(){
		return highScore;
		
	}
	
	public String gethealthPoint(){
		return healthPoint;
	}
	
	//Setters
	public void setNewPlayerName(String newName){
		this.name = newName;
	}
	
	public void setNewStatus(String newStatus){
		this.status = newStatus;
	}
		
	}
	
