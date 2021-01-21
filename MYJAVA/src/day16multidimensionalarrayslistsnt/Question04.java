package day16multidimensionalarrayslistsnt;

public class Question04 {

	public static void main(String[] args) {


		int ma[][] = { {5}, {9,6,2},  {11,12, 10}  };
		int sum = 0;
		int mul= 1;
		for(int i= 0; i<ma.length; i++) {
			
			for(int j =0 ; j<ma[i].length ; j++) {
				
				sum = sum+ ma[i][j];
				mul = mul* ma[i][j];
			}
			
			
		}
		
		System.out.println(sum);
		System.out.println(mul);

	}

}
