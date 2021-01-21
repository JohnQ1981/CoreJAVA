package day23overridingnt;

public class Ovr01 {

	/*
	 1)If you need to change the implementation of a method which is in 
	   parent class to make it more specific for child class you can update
	   the method body. In java this process is called "Method Overriding"
	 2)When you make "overriding" DO NOT change method signature(method name
	   and method parameters) 
	 3)In overriding we definitely change method body because our goal is 
	   to create a specific implementation, if you do not change the method
	   body, Java does not complain but the thing you made is not meaningful
	 4)If you need you can change return type and access modifier according to some rules.
	 5)The method which is overridden from parent class is called "Overridden Method",
	   the method which is in child class is called "Overriding Method" 
	 6)When you override the access modifiers of "Overridden" and "Overriding" methods can be same.
	   If they are different, access modifier of "Overriding" method must be wider than 
	   access modifier of "Overridden" method
	 7)For primitive return types "Overridden" and "Overriding" methods must have same
	   return type. If you use different primitive return type Java will complain when you 
	   make overriding.
	 8)For non-primitive return types "Overridden" and "Overriding" methods may have same 
	   same return types. If they are different a)There must be parent-child relationship
	   between the return types. b)The return type of the "Overriding" method must be the 
	   child of the return type of "Overridden" method.In the interview tell like that;
	   "We should have IS-A Relationship from "Overriding" method to "Overridden" method in
	   return types."
	 9)For overriding "INHERITANCE" is must.
	 
	 10)What is polymorphism? 
	    Answer: Polymorphism is the combination of "Method Overloading" and "Method Overriding"
	    
	    What is the difference between "Method Overloading" and "Method Overriding"?
	    a)In "Method Overloading" we change the method signature because we are changing
	      parameters, but in "Method Overriding" we do not touch method signature we change the 
	      method body.
	    b)In "Method Overloading" we do not need inheritance but we cannot do "Method Overriding" 
	      without inheritance.
	    c)"Method Overloading" happens in Compile Time but "Method Overriding" happens in Run Time.
	      Because of that we call "Method Overloading" as "Compile Time Polymorphism(Static)" and we call 
	      "Method Overriding" as "Run Time Polymorphism(Dynamic)"
	      
	      final, private, static: no overriding allowed.
	      final, private, static: but you can overload.
	*/
}