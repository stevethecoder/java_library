package _22_Dog_Exercise;

public class Dogs {
	private String name;
	private String type;
	private int age;
	private String color;
	
	public String setName(String paramName){
		name = paramName;
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	public String setColor(String paramColor){
		color = paramColor;
		return color;
	}
	
	public String getColor(){
		return color;
	}

	public String setType(String paramType){
		type = paramType;
		return type;
	}
	
	public String getType(){
		return type;
	}
	
	public int setAge(int paramAge){
		age = paramAge;
		return age;
	}
	
	public int getAge(){
		return age;
	}
}
