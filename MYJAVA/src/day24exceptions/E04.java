package day24exceptions;

public class E04 {

	public static void main(String[] args) {

			String s1 = "";
		System.out.println(s1.length());
		
		String s2 = null;
		//System.out.println(s2.length());//NullPointerExeption
		try {
	System.out.println(s2.length());
	
		} catch(NullPointerException e) {
			// Every Exception class has a specific Exception message.
			// if you want to see just message on the console use getmessage()
			System.out.println(e.getMessage());
			System.out.println("the String is null object, for null obeject lenght method does not run");
		}
		
		
	}

}
