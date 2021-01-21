package day13constructorsstatickeyword;


public class Static02 {
	
	

	public static void main(String[] args) {

     Static01 obj1 = new Static01();
     System.out.println(obj1.age);//23
     
     obj1.subtract(11, 3); //8
     
     //not recommended
     obj1.add(15, 5);// using object to access Static method, not recommended , use Class name
     					// and access by Using Class name // 
     Static01.add(19,12);
     System.out.println(Static01.height);
     
    Static01.add(19,12);
    
    Static01 obj2 = new Static01();
    System.out.println(obj2.height);
    
    //update Static Variables
    Static01.height++;
		
    System.out.println(obj1.height);
    
    System.out.println(obj2.height);
    
    // Update instance variables
    
    obj1.age++;
    
    System.out.println(obj1.age);//24
    
    System.out.println(obj2.age);//23
    
    
    
    
    
    
    
	}

}
