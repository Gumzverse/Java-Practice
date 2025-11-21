
public class TeachingEmp extends Employee {
	private String subject;
	
	public TeachingEmp(String name, int age, int employeeID, String department, String subject) {
		super(name, age, employeeID, department);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void displayInfo() {
		System.out.println("======Employee Details=====");
		System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nEmployeeID: "+getEmployeeID()+"\nDepartment: "+getDepartment()+ "\nSubject: "+subject);
	}
}