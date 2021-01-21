package day03ifstatementnt;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 Logical Operators:
		 
		 &&  "and" operators are used between boolean 
		 	1) && ==> And operator
		 	   true&&flase = false
		 	   False&& false= false
		 	   true&&true = true
		 	   false&&true=false
		 	   
		 	 2) || == or Operator 
		 	      true||true=true;
		 	      false||true=true;
		 	      true||false=true;
		 	      false||false=false;
		 	        
		 	  3) !  ==> not operator 
		 	     !true =false
		 	     !false=true
		 	     !!true=true
		 	     
		 	    Detail information: 
		 	     normally And operator is single & but Java uses &&
		 	     because when you type && your code will run Faster
		 	     false&&true= false so java just checks first condition
		 	     if you use && Java will not check second condition so saves time.
		
		 */
		if(9>7 && 8<9) {
			System.out.println("True");
			
		}
		//else System.out.println("False");
		
		if(5<7||3<1) {
			System.out.println("Bad:)");
			
			
			
		}

	}

}
