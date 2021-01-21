package day12methodcreationconstructorsnt;

public class Test {

	
	public static String function(float i, int j){  

        return "Good";  

    } 

    public static String function(double i, double j){  

        return "Bad";  

    }  

    public static void main(String[] args){  

        System.out.println(function(2.1F, 3.2));      

    }  


}