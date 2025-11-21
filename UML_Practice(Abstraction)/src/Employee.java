
public abstract class Employee extends Person {
	private int employeeID;
	private String department;
	
	public Employee(String name, int age, int employeeID, String department) {
		super(name, age);
		this.employeeID = employeeID;
		this.department = department;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void displayInfo() {
		System.out.println("======Employee Details=====");
		System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nEmployeeID: "+employeeID+"\nDepartment: "+department);
	}
}