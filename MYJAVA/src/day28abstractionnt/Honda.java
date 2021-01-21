package day28abstractionnt;


   /*
    * 1. Sometimes we need methods without body, those methods are called "abstract methods".
    *  Note: Sometimes all child classes update the method body when they override and 
    *  		do not use the method from parent class without updating the method body. 
    *  		if the method body is not used all the time, it is not meaningful to create body of a method.
    *  
    * "abstract methods" can only be created in Abstract Classes.
    * 2. To create "abstract method" ,
    * 		a. we need to remove method body
    * 		b. we need to remove curly parenthesis
    * 		c. we need to put "abstract" keyword  between access modifier and return type
    * 3. We can "abstract method" only in abstract classes.
    * 4. to make a class abstract, we must use "abstract" keyword after access modifier.
    * 
    * 5. if A non "abstract"(concrete) is the child of an abstract class, it must override all abstract methods 
    * from parent class otherwise Java will complain. 
    * 
    * 6. Inside the abstract class, we can create both concrete and abstract methods. 
    * both are allowed. 
    * You CANNOT CREATE ABSTRACT METHODS IN A CONCRETE CLASS. it is not allowed. 
    * 7."in a child class, " abstract methods " must be overridden, but concrete methods are optional.
    * 8. to make some features MUST for child classes, we create "abstract methods" in parent classes.
    * 9. Java does not support multiple inheritance for concrete parents, the same rule is valid
    * for abstract parents too.
    * 10. For a method, you cannot use "abstract " keyword and method body together,
    * if a method has a body, it cannot have abstract keyword,
    * if a method has a abstract keyword, do not use method body in parent class.
    * so the main ideas for abstract methods is to be"overridden" , if they are overridden , we should be good.
    *  
    *  11. An Abstract method cannot be final, because we create abstract method for child classes
    *  Child classes will override and use the abstract methods, if you make it final it means it
    *  cannot be overridden, that is contradiction, that is why Java
    *  does not let abstract method to be final. 
    *  12. An Abstract method cannot be private, because we create abstract method for child classes
    *  Child classes will override and use the abstract methods, if you make it private it means it
    *  cannot be overridden, that is contradiction, that is why Java
    *  does not let abstract method to be private. 
    *13. for "abstract methods" we use "public" and "protected" , "default" can be used, but not 
    *recommended.
    *
    *14. An Abstract method cannot be "STATIC", because we create abstract method for child classes
    *  Child classes will override and use the abstract methods, if you make it "static" it means it
    *  cannot be overridden, that is contradiction, that is why Java
    *  does not let abstract method to be Static. 
    *  
    *  !!!WE CANNOT CREATE OBJECTS BY USING ABSTRACT CLASSES!!!
    *
    */
public abstract class Honda {

	
	
	public abstract void engine();
	
	public   void leather() {
		System.out.println("It has genuine leather seats");
	}
}
