package day24exceptions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {

		//FileInputStream fis = new FileInputStream(C:\Users\IK\eclipse-workspace\techproedfall2020\src\day24exceptions\TextFile.txt);
		
		FileInputStream fis = new FileInputStream("src/day24exceptions/TextFile");
		
		int k;
		while((k = fis.read())!= -1) {
			System.out.print((char)k);
			
			
		}
		fis.close();
		
	}

}
