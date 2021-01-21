package day23overridingnt;




/*
 * 1.) if you need to change the implementation of a method which is
 * in parent class to make it more specific for child class you can update 
 * the method body. . In JAVA this process is called:"Method Overriding"
 * 
 * 2.) When you make overriding do not change Method Signature: method name and method parameters. 
 * 
 * 3.)in Overriding we definitely change Method Body because , our goal is 
 * to create a specific implementation for the child Class. 
 * if you do not change the method body, Java does not complain
 * but it will not make any sense.  
 * 
 * 4.) If you need you can change Return type and Access Modifier according to some
 * rules.
 * 
 * in Overriding we need Inheritance
 * in Overloading no need to for Inheritance
 * The main difference between Overriding and Overloading
 * is in Overloading we have to change Parameters,
 * in Overriding we cannot change Parameters. but we change body
 * 
 * 5) the method which is Overridden from parent Class is Called
 * " Overridden Method"
 * the method which is in Child class is called "Overriding Method"
 *  6.) when we do Overriding we can use the Same Access Modifiers. 
 *  The Access Modifiers of "Overridden" and 'Overriding' Methods
 *  can be the same. If they are different , Access modifier of "Overriding"(Child)
 *  Method bust be wider than Access Modifier of "Overridden"(Parent) method
 * 
 * child method Cannot Restrict Parent Method.
 * Overriding method's access modifier at least should be the same , or wider.
 * 7.) For primitive return types "Overridden and "Overriding methods
 * must have same return type, if you use different primitive return type
 * JAVA will complain when you make Overriding.
 * 8.) for Wrapper Classes we cannot use different Return Types. 
 *  FOR NON PRIMITVE RETURN TYPES : 
 *  "Overridden and "Overriding methods  MAY HAVE THE SAME RETURN TYPES.
 *  IF THEY ARE DIFFERENT 
 *  	a) there must be parent child Relationship.
 *  	b)The Return Type of the "Overriding" Method must be the child of the 
 *  return type of the "Overridden Method.
 *  in the interview tell like that:
 *  "We should have IS A relationship from "Overriding Method to Overridden method"
 *  in return types.
 *  9) For "Overriding " Inheritance is MUST. if there is not Inheritance
 *  there is no "Overriding";
 *  
 *  What is Polymorphism:
 *     Polymorphism is the combinaiton of " Method Overloading" and
 *     "Method Overriding".
 *     
 *     What is the difference between " Method Overloading" and "method Overrding"
 *     
 *     	a) in Method Overloading we change the Method Signature since we are changing parameters.
 *      but in Method Overriding we do not Touch "Method Signature" , that is the name and parameter.
 *      we change the Method body.
 *      
 *  	b) in Method Overloading we do not need Inheritance but for Method Overriding
 *  we have to have Inheritance. Inheritance is must. 
 *  	c) Method Overloading happens in Compile time, but "Method Overriding" happens in Run Time. 
 *   	  that is why we call Method Overloading as "Compile Time Polymorphism(STATIC),
 *   and we call Method Overriding as" Run Time Polymorphism(Dynamic)" .
 *   	
 *   final, private and static methods cannot be overridden.
 *   
 *   
 *   
 */




public class Override01 {

}
