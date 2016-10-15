package _14_Constructor_Employee;

public class Manager extends Employee{

	public String department;
	public String wholename;
	
	Manager(String wholename, double salary, String department) {
		super(wholename, salary);
		this.wholename = wholename;
		this.department = department;
	}

}
