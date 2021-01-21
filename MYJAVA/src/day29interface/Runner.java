package day29interface;

public class Runner {

	public static void main(String[] args) {

		Honda c1 = new Honda();
		
		c1.move();
		c1.gas();
		c1.seat();
		c1.steeringWheel();
		c1.radio();
		c1.tire();
		c1.hood();
		c1.headlight();
		c1.color();
		c1.windowtint();
		c1.clean();
		//All Variables are STATIC in interfaces, because of that we use " interface names' to access them
		//if you use object to access variables in an interface, Java will give you anyone of them
		// to make sure to select a specific variable , you have to use interface names.it is must. 
		System.out.println(Outside.PRICE);
		System.out.println(Inside.PRICE);
		System.out.println(c1.NUM);//12 ==> not recomended.
									//for unique variables if you use object to access variable
									//it works but not recommended. use interface name
									//because we prefer to access static class member by using" class names
									//or "interface" names.
		System.out.println(Inside.PRICE);//12 ===> recomendded.
		// if you use "default" keyword to create concrete methods in an interface, you can access them by 
		//using just objects. but if you use "static" keyword to create a concrete method in an interface.
		// you have to use interface name to access them. Example: Outsite.sunroof();
		c1.polish();// from Outside
		
		Outside.sunroof();
		
		

	}

}
