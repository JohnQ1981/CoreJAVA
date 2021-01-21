package day24exceptions;

public class E05 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6};
		try {
			System.out.println(arr[6]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
			
			e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: 6
								//at day24exceptions.E05.main(E05.java:9)				
		}
		//ArrayIndexOutOfBoundsException is thrown if you use
		//non-existing index for an array
		
		

	}

}
