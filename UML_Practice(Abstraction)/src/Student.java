
public class Student extends Person {
	private int studentID;
	private String course;

	public Student(String name, int age, int studentID, String course) {
		super (name, age);
		this.studentID = studentID;
		this.course = course;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getCourse() {
		return course;
	}
	public void displayInfo() {
		System.out.println("======Student Details=====");
		System.out.println("Name: "+ getName() +"\nAge: " + getAge() + "\nStudentID: "+ studentID + "\nCourse: " + course);
	}
}
