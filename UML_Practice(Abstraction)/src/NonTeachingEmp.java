
public class NonTeachingEmp extends Employee{
	private String position;
	
	public NonTeachingEmp(String name, int age, int employeeID, String department, String position) {
		super(name, age, employeeID, department);
		this.position = position;
	}
	public String getPosition(){
		return position;
	}
	public void displayInfo() {
		System.out.println("======Employee Details=====");
		System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nEmployeeID: "+getEmployeeID()+"\nDepartment: "+getDepartment()+ "\nPosition: "+position);
	}
}