package novemberpractice;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Question02BookStore {
	
	static int id=1000;
	
	static String bookName;
	static String author;
	static int yearofpub;
	static double price;
	
	
	static HashMap<Integer,String> books = new HashMap<>();
	
	public static void main(String[] args) {
			
		    addSomeBooks();
			menu();
			
	}

	 public static void menu() {
		 //do {
				Scanner scan = new Scanner(System.in);
				System.out.println("1-Add Book");
				System.out.println("2-Search by Book Id");
				System.out.println("3-Search by Eny book info");
				System.out.println("4-Delete by Book Id");
				System.out.println("5-List All Books");
				System.out.println("6-Press '6' to Exit/Quit");
				int input = scan.nextInt();
				
//				if(input==6) {
//					System.out.println("Thanks and Bye bye now!");
//					break;
//				}
				switch (input) {
				case 1:
					addBook();
					break;
				case 2:
					searchById();
					break;
				case 3:
					searchByInfo();
					break;
				case 4:
					deleteById();
					break;
				case 5:
					listBooks();
					break;
				case 6:
					quit();
					break;
				default:
					System.out.println("Please Select only 1,2,3,4,5 or 6");
					break;
				}
				
			//}while(true);
		 
	 }
	
	 public static void addBook() {
		//do {
			
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter book name");
		 bookName =scan.nextLine();
		 
		 System.out.println("Enter author");
		 author=scan.nextLine();
		 
		 System.out.println("Enter Year of Publication");
		 yearofpub=scan.nextInt();
		 
		 System.out.println("Enter Price");
		 price= scan.nextDouble();	
		 
		 String info =":Book Id"+ "\nBook Name: "+bookName+"\n"+"Author: "+author+"\n"+"Year of Publication: "+yearofpub+"\n"+"Price: "+price;
		 books.put(id, info);
		 id++;
		 menu();
		//} while(true);
		 
	 }
	 
	public static void searchById() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Id to find a book if it is in Book Store from list below");
		
		for (Integer keys : books.keySet())  
		{
		   System.out.println(keys + ":"+ books.get(keys));
		}

		
		Integer input=scan.nextInt();
		if(books.isEmpty()) {
			
			System.out.println("Book Store has no any books");
		}else if(books.containsKey(input)) {
			
			System.out.println("The Book is "+ books.get(input));
		}else {
			
			System.out.println("The Book the Id you Entered for is not in our Store");
		}
		
		menu();
			
		}
		
	public static void addSomeBooks() {
		books.put(9999, "Lords, John , 2001, 11");
		books.put(9998, "Countries, Ted, 2005, 10");
		books.put(9997, "Illness, Tulin, 2005, 21");
		books.put(9996, "Roads, Suzan, 2005, 30");		
	}
	 public static void searchByInfomine() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Book Name, author or Year of Publication");
		 for (Integer keys : books.keySet())  
			{
			   System.out.println(keys + ":"+ books.get(keys));
			}
		 String input =scan.nextLine();
		 if(books.isEmpty()) {
			 System.out.println("Book store has no any books ");
		 }else if(books.containsValue(input)) {
			 System.out.println("the book your are looking for:" + books.get(input));
		 }else {
			 System.out.println("No such a book exists in our Book Store");
		 }
		 
		 menu(); 
	 }
	 
	 public static void searchByInfo() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter any information about book");
			for (Integer keys : books.keySet())  
			{
			   System.out.println(keys + ":"+ books.get(keys));
			}
			String searchInfo=scan.nextLine();
			int flag=0;
			for (Entry<Integer, String> entry : books.entrySet()) {
				if (entry.getValue().contains(searchInfo)) {
					System.out.println("Id = " + entry.getKey() + ", Book Information= " + entry.getValue());
					flag++;
				}
			} if(flag==0) {
				System.out.println("Book is not found in the Store");}
			System.out.println("============================");
			menu();
			}
	 
	 
	 
	 public static void deleteById() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Id to Delete book from store database");
		 for (Integer keys : books.keySet())  
			{
			   System.out.println(keys + ":"+ books.get(keys));
			}
		 Integer input= scan.nextInt();
		 if(books.isEmpty()) {
			 System.out.println("Book store has no any books ");
		 }else if(books.containsKey(input)) {
			 System.out.println("the book your are deleted is: " + books.remove(input));
		 }else {
			 System.out.println("No such a book exists in our Book Store");
		 }
		 
		 menu();
		 
	 }
	 
	 
	 public static void listBooks() {
		 for (Integer keys : books.keySet())  
			{
			   System.out.println(keys + ":"+ books.get(keys));
			}
		 menu();
	 }
	 
	 
	 public static void quit() {
		 System.out.println("Thank you for using our application");
	 }
	 
	 
	 
//	//Search a  book with any information
//		private static void searchByAny(HashMap<Integer, BookStore> myStore) {
//			// TODO Auto-generated method stub
//			Scanner scan = new Scanner(System.in);
//			System.out.print("Enter any keyword about the book: ");
//			String info=scan.nextLine();
//			
//			System.out.println(info);
//			for (String b : myStore.values())
//			{
//				if (b.toString().indexOf(info)>-1)
//				{
//					System.out.println(b);
//				}
//				else {
//					System.out.println("This book is not in the store");
//				}
//			}
//				
//				
//			
//			
//		}
	 
	 
	 
	 
}
