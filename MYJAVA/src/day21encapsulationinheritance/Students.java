package day21encapsulationinheritance;

public class Students {

	private String address = "Kansas City, Missouri";// getter+setter
	private String name = "Ali Can"; //getter
	private String ssn = "123456789";//getter
	
	public static void main(String[] args) {



	}
	//getter
	public String getaddress() {
		return address;
	}
	
	//setter
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSsn() {
		
		return "*****" + ssn.substring(5);
	}
	
	public void setSsn(String ssn) {
		this.ssn= ssn;
	}
}
