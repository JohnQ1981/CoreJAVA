package javadevelopmentntDay01;

public class Enum01Class {

	public static void main(String[] args) {

		Enum01 browserName= Enum01.CHROME;

		switch(browserName) {

		case CHROME :
			System.out.println("Chrome Browser is running");
			break;
		case SAFARI :
			System.out.println("SAFARI Browser is running");
			break;
		case IE :
			System.out.println("IE Browser is running");
			break;
		case OPERA :
			System.out.println("OPERA Browser is running");
			break;
		case FIREFOX :
			System.out.println("OPERA Browser is running");
			break;
		default:
			System.out.println("Invalid browser name");


		}

	}

}
