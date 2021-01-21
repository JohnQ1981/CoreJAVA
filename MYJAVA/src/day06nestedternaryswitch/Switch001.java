package day06nestedternaryswitch;

import java.util.Scanner;

public class Switch001 {

	public static void main(String[] args) {
/*
 Switch works like if else if
 when user enter the number of the day print the name of the day
 
 
 */
Scanner scan = new Scanner(System.in);
System.out.println(" Enter Number of a Day");
int nd = scan.nextInt();
if(nd == 1) {
	System.out.println("sunday");
}
else if(nd==2) {
	System.out.println("Monday");
}
else if(nd==3) {
	System.out.println("Tuesday");
}
else if (nd ==4) {
	System.out.println("Wednesday");
}
else if(nd==5) {
	System.out.println("Thursday");
}
else if (nd == 6) {
	System.out.println("Friday");
}
else if(nd==7) {
	System.out.println("Saturday");
}
else {
	System.out.println("Enter a valid number for days 1/2/3/4/5/6/7");
}
/*String day = nd ==1? "monday":nd ==2?"tuesday"? nd==3 ?"wednesday"?nd==4?
"Thursday"?nd==5?"Firday"?nd==6 ? "Saturday"?nd==7 ? "Sunday"; 	*/	
		
	// use Switch

switch (nd) {
 case 1:
	 System.out.println("Sunday");
	 
	case 2:
		 System.out.println("Monday");
		 
	case 3:
		 System.out.println("Tuesday");
		 
		 
	case 4:
		 System.out.println("Wednesday");
		 
	case 5:
		 System.out.println("Thursday");
		 
	case 6:
		 System.out.println("Friday");
		 
	case 7:
		 System.out.println("Saturday");
		 break;
		 default:
			 System.out.println("Enter a valid number for days 1/2/3/4/5/6/7");
	}

	scan.close();	
		
		

	}

}
