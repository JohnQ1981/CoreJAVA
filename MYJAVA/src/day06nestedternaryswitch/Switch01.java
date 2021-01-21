package day06nestedternaryswitch;

import java.util.Scanner;

public class Switch01 {

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
	 break;
	case 2:
		 System.out.println("Monday");
		 break;
	case 3:
		 System.out.println("Tuesday");
		 break;
		 
	case 4:
		 System.out.println("Wednesday");
		 break;
	case 5:
		 System.out.println("Thursday");
		 break;
	case 6:
		 System.out.println("Friday");
		 break;
	case 7:
		 System.out.println("Saturday");
		 break;
		 default:
			 System.out.println("Enter a valid number for days 1/2/3/4/5/6/7");
	}
// in Switch  Statement , you cannot use long data type, 
// you cannot use long , double, float, and boolean.
// we can use int, byte, short,int and string. char. 
char x = 'a';
char y = 'b';
System.out.println(x+y);
System.out.println('x'+'y');

	scan.close();	
		}

}
