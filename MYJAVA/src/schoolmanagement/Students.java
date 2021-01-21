package schoolmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {

	private int id= 1000;
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeLevel ;
	private String courses ="";
	private int costOfCourse=600;
	private int tuitionBalance;
	
	
	// creating unique method
	public void setStudentId() {
		
		//StudentiD =3 +id =1001 ==> 3101 
		//StudentiD =3 +id =1002 ==> 3102 
		//StudentiD =3 +id =1003 ==> 3103 
		id ++;
		this.studentId= gradeLevel + "" + id;
	}

	
	public Students () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student's First Name:");
		this.firstName= scan.nextLine().trim();
		
		
		
		System.out.println("Enter Student's Last Name:");
		this.lastName= scan.nextLine().trim();
		
		System.out.println("Enter Student's Class Level");
		System.out.println("1 - Freshmen");
		System.out.println("2 - Saphomore");
		System.out.println("3 - Junior");
		System.out.println("4 - Senior");
		
		this.gradeLevel = scan.nextInt();
		setStudentId();
		
	}
	public void enroll() {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Course to enroll (Q to quit)");
			
			String course = scan.nextLine();
			
			if(!course.equals("Q")){
				
				courses= courses + "\n"+ course;
				tuitionBalance= tuitionBalance+costOfCourse;
				
			} else {
				break;
			}
			
			
		}while(true);
		System.out.println("You Enrolled in: "+ courses);
		//selectOptions();
		
	}
	
	public void payTuition() {
		
		System.out.println("Your balance is: "+"$"+ tuitionBalance);
		Scanner scan = new Scanner(System.in);
		System.out.println("How much do you want to pay?");
		int payment = scan.nextInt();
		tuitionBalance = tuitionBalance-payment;
		System.out.println("Thanks for the payment of $"+payment+"\nYour new Balance is: $"+ tuitionBalance);
		selectOptions();
		
	}
	
	public String toString() {
		
		return "\nSTUDENT ID:" + studentId+
				"\nSTUDENT NAME: "+ firstName+lastName +
				"\nGRADE LEVEL: "+ gradeLevel+
				"\nCOURSES ENROLLED: " + courses+
				"\nREMAINING BALANCE: "+ tuitionBalance;
	}
	
	static Map<String, String> studentInfo = new HashMap<>();
	public static void addStudentsToMap() {
		Scanner scan = new Scanner(System.in);
		String exit ="";
		while (!exit.equals("S")) {
			Students s = new Students();
			s.enroll();
			s.payTuition();
			studentInfo.put(s.studentId, s.toString());
			
			System.out.println("Press 'S' to stop entrance.");
			
			System.out.println("Press enter to go on etrance. ");
			
			exit=scan.nextLine();
			
		}
		selectOptions();
	}
	
	public static void getStudentInfo() {
		Scanner scan = new Scanner(System.in);
		String idOfStudent="";
		String result="";
		do {
			
			System.out.println("Enter Student Id to get the information");
			System.out.println("Press 'X' to end the program");
			idOfStudent = scan.nextLine();
			result = studentInfo.get(idOfStudent);
			
			if (!idOfStudent.equals("X")) {
				System.out.println(result);
			}
			
			
		}while(!idOfStudent.equals("X"));
		selectOptions();
		
	}
	
	public static void removeStudent() {
		Scanner scan = new Scanner(System.in);
		String idOfStudent="";
		String result="";
		
		do {
			
			System.out.println("Enter Student ID to Remove!");
			
			System.out.println("Press 'X' to end the program");
			
			idOfStudent = scan.nextLine();
			
			
			result = studentInfo.remove(idOfStudent);
			
			if (!idOfStudent.equals("X")) {
				System.out.println(result);
				System.out.println("Removed from the students list");
			}
			
			
			
		}while (!idOfStudent.equals("X"));
		selectOptions();
		
	}
	
	public static void selectOptions() {
		
		System.out.println("Select the Options:");
		System.out.println("1- Add Student");
		System.out.println("2- Get the Student's Information by id:");
		System.out.println("3- remove Student by id");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			addStudentsToMap();
			break;
			
		case 2:
			getStudentInfo();
			break;
			
		case 3 :
			removeStudent();
			break;
			default:
				System.out.println("Invalid selection, please select 1,2, or 3 !");
		}
		
		
		
	}
	
	
	
	
	
}
