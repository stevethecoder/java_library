package _12B_Movies_Challenge_Constructor;

public class Movies {
	
	//Properties
	
	public String mtitle;
	public String mdirector;
	public String mactor;
	public String mactress;
	int myear;
	int mlength;
	
	public Movies(String ptitle, String pdirector, String pactor, String pactress, int pyear, int plength) {
		this.mtitle = ptitle;
		this.mdirector = pdirector;
		this.mactor = pactor;
		this.mactress = pactress;
		this.myear = pyear;
		this.mlength = plength;
		
		
	}
	
	//constructor
	// a constructor is a method that has the same name as the Class itself - it builds our instances or objects of that class type
	
	//Movies(String name, String title, String director, String actor, String actress, int year, int length) {
//		this.name = name;
//		this.title = title;
//		this.director = director;
//		this.actor = actor;
//		this.actress = actress;
//		this.year = year;
//		this.length = length;
//		
//	}
	
}
	


