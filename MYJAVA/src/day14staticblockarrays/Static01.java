package day14staticblockarrays;
import java.util.Scanner;
public class Static01 {
        
		String studentName;
		int year = 2020 ;
	    static int counter = 1000;
	    String studentId;
	    
	    
	    public Static01() {/// constructor
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter Name");
	    	 this.studentName = scan.next();
	    	 setId(); // calling method 
	    	 
	    	
	    }
	
	public static void main(String[] args) {
      /*
       Type a program to Create unique student IDs
       */
		Static01 student1 = new Static01();// object
		System.out.println(student1.studentName+ student1.studentId);
		
		
		Static01 student2= new Static01();
		System.out.println(student2.studentName+ student2.studentId);
			}

	public void setId() {//method
		
		counter ++;
		this.studentId = year+"" + counter;
		
	}
	
	
	
}
