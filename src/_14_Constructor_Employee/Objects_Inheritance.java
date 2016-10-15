package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {

		Employee paul = new Employee("Paul", 100000.00);
		Employee e200 = new Employee("Sydney", 100000.00);
		System.out.println(paul.wholename + paul.salary);
		System.out.println(e200.wholename + e200.salary);
	}

}
