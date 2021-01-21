package day32collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProject01 {
	
	/*
	 create saveInfo() method
	 1) get multiple  ssn(9digits), full name, address, phone number from user
	  ssn will be key the other info will be value.
	  2) put data into a map, like ssn willbe key, all other info will be the values
	  3) if user tries to use repated ssn, give an error message and ask user to enter a new ssn
	  4) Tell user to stop by pressing Q
		
		
		
	 */

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		
//		saveInfo(hm);
//		getInfo(hm);
//		removeInfo(hm);
		String option ="";
		select(option,hm);
		
		
		
	}
	
	
	
	
//	Create getInfo() method
//	 1)Get personal information by using SSN
//	 2)If SSN does not exist, give an error message then ask user to enter again
	
	
	public static void saveInfo(HashMap<String, String> hm) {
		
		
		Scanner scan =new Scanner(System.in);
		
		String ssn ="";
		
		
		do{
			System.out.println("Enter SSN");
			System.out.println("To Exit or Stop Press 'Q'");
			ssn=scan.next();
			
			if(ssn.equalsIgnoreCase("Q")) {
				
				break;
				
			}
			
			else  {
			while (hm.keySet().contains(ssn)) {
				
				System.out.println(ssn+" exists  in the map. Use another SSN");
				ssn= scan.next();
			}
			}
			// if you need to use nextLine() after next(), please use empty nextLine();
			scan.nextLine();
			
			System.out.println("Enter Your Full name");
			String name = scan.nextLine();
			
			System.out.println("Enter Your Address");
			String address= scan.nextLine();
			
			System.out.println("Enter Phone number(10 digitis)");
			String phone = scan.nextLine();
			
			String personInfo = "\nName: "+name+"\nAddress: "+address+"\nPhone: "+phone;
			
			hm.put(ssn, personInfo);
			
			
			
		}while(true);
		
		System.out.println("Your info " +hm);
		
		
		
	}
	
	public static void getInfo(HashMap<String,String> hm) {
		Scanner scan = new Scanner(System.in);
		String ssn= "";
		//String result = "";
		
		do {
			System.out.println("Enter SSN to get detailed information!");
			System.out.println("Press 'Q' to end the program");
			
			ssn = scan.next();
			
			if(ssn.equalsIgnoreCase("Q")) {
				System.out.println("Thank you! Bye now!");
				break;
			}
			
			if(hm.isEmpty()) {
				System.out.println("There is no any data to display. Bye Now ");
				break;
			}else if(hm.containsKey(ssn)) {
				String personInfo=hm.get(ssn);
				System.out.println(ssn+" has the following date:\n"+ personInfo);
			}else {
				System.out.println(ssn+" is not valid ssn. Please enter a valid ssn.");
			}
			
			
			
			
			}while(true);
		//while(!ssn.equals("Q"));
		
	}
	
	/*
	 * Create removeInfo() method
	 1)Remove data by using SSN
	 2)If SSN does not exist give a message to the user, and ask him to enter again
	 3)If the map is empty, give a message to the user and end the program.
	 */
	public static void removeInfo(HashMap<String,String> hm) {
		Scanner scan = new Scanner(System.in);
		String ssn ="";
		
		
		do {
			System.out.println("Enter SSN to remove from system from the list below");
			
			for (String keys : hm.keySet())  
			{
			   System.out.println(keys + ":"+ hm.get(keys)+"\n");
			}
			System.out.println("Press 'Q' to end the program");
			ssn =scan.next();
			if(ssn.equalsIgnoreCase("Q")) {
				System.out.println("Thank you! Bye now!");
				break;
			}
			
			if(hm.isEmpty()) {
				System.out.println("there is no any data to remove, bye Now");
				break;
			}else if(hm.containsKey(ssn)) {
				String personInfo=hm.remove(ssn);
				System.out.println(ssn+ " you entered is removed/deleted"+personInfo);
			}else {
				System.out.println(ssn+ " is not in the map. please enter the one that is below");
				for (String keys : hm.keySet())  
				{
				   System.out.println(keys + ":"+ hm.get(keys));
				}
			}
			
			
			
		}while(true);
		System.out.println(hm);
		
	}
	
	
	
	
	public static void select(String option, HashMap<String,String> hm) {
			Scanner scan = new Scanner(System.in);
			
			do {
			System.out.println("Enter 1,2, or 3 to begin from the options below");
			System.out.println("1: Add date\n2: Get data\n3: Remove/delete data");
			System.out.println("To end the Program press 'Q' ");
			option= scan.next();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
			
			case "1":
				saveInfo(hm);
				break;
				
			case "2":
				getInfo(hm);
				break;
			case "3":
				removeInfo(hm);
				break;
			default:
				System.out.println("Please Select only 1,2 or 3, or 'Q' to end");
				
			}
			
			}while(true);
		
	}
	
	

}
