package day24exceptions;


public class ClassE {

	public static void main(String[] args) {	

		String s2 = null;	

		try{
			System.out.print("Good");
			System.out.println(s2.length());

            System.out.print("Good");

		}catch(NullPointerException e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.print("Better");	

		}

}
}
