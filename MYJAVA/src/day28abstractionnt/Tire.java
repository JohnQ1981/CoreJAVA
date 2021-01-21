package day28abstractionnt;

public abstract  class Tire extends Honda {

	/*
	 * as you see, even i did not override abstract methods, no complain.
	 * because , for abstract child classes, it is not must to override abstract methods.
	 * 
	 * 
	 * 
	 */
	
	protected abstract void unused();
	//static abstract void unused();// cannot be static
	public abstract void unused1();
	 abstract void unused2();//default , can only be accessed from the same package. 
	 
	
	
}

