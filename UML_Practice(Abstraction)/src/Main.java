//Reviewer for UML_Abstraction by Ian Gumz:
public class Main {

	public static void main(String[] args) {
//Run methods for Student Class
		Student s1 = new Student("Ted T. Teddy", 20,2323, "Biology");
		s1.displayInfo();
		System.out.println();
//Run methods for TeachingEmp Class
		TeachingEmp TE1 = new TeachingEmp("John Gibs",122,1022304,"MAPEH","Physical Education");
		TE1.displayInfo();
		System.out.println();
//Run methods for NonTeachingEmp Class
		NonTeachingEmp NTE1 = new NonTeachingEmp("Elon Musk", 53, 2, "IT Department", "CEO");
		NTE1.displayInfo();
		System.out.println();
		
	}
}


// *Change ID String to int
////     	        	   <<abstract>> Person
//					-----------------------------
//			  		- name : String
//			  		- age : int
//			  		-----------------------------
//			  		+ Person(name : String, age : int)
//			  		+ getName() : String
//			  		+ getAge() : int
//			  		+ setName(name : String) : void
//			  		+ setAge(age : int) : void
//			  		+ displayInfo() : void
//			  		-----------------------------
//						      		▲
//						     	 	│
//				  ---------------------------------------
//				  |                                     |
//			     Student                  		  <<abstract>> Employee
//			  ---------------------     	-----------------------------
//			  - studentID : String    	  	- employeeID : String
//			  - course : String           	- department : String
//			  ------------------         	----------------------------
//			  + Student(name : String,    	+ Employee(name : String, age : int, 
//			  age : int, studentID :   	  	employeeID : String, department : String)
//		      String, course : String) 
//			  + getStudentID() : String		+ getEmployeeID() : String
//			  + getCourse() : String    	+ getDepartment() : String
//			  + displayInfo() : void    	+ displayInfo() : void
//			  ---------------------			-----------------------------								
//							                                 ▲
//								                             │
//								           ------------------------------------------
//								           |                                        |
//								     Teaching                                 NonTeaching
//								  -------------------                       --------------------
//								  - subject : String                        - position : String
//								  -------------------                       --------------------
//								  + Teaching(name : String,                 + NonTeaching(name : String, 
//								    age : int, employeeID : String,           age : int, employeeID : String,
//								    department : String, subject : String)    department : String, position : String)
//								  + getSubject() : String                   + getPosition() : String
//								  + displayInfo() : void                    + displayInfo() : void
//								  ---------------------			            -----------------------------	