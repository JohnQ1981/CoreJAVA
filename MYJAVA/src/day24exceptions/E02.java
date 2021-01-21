package day24exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
	/*
	 * 1)if try block runs without any issue,catch blocks will not run,
	 * 2) in the try catch block we can use multiple catch blocks.
	 * but the order of Exception Classes are important, 
	 * we have to use child Exception Classes first before Parent Exception Classes
	 * 
	 * 3) after the "catch" block you can use finally block as well
	 *  finally block runs under every condition. If there is any problem in try
	 *  block finally block runs 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int k;
		FileInputStream fis = null;;
		try {
			
			fis = new FileInputStream("src/day24exceptions/TextFile");
			
			while((k= fis.read())!= -1) {
				
				System.out.print((char)k);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Path is Wrong or the file is deleted");
			//e.printStackTrace();
			
		} catch(IOException e) {
			
			System.out.println("The file cannot be read");
			
		} finally {
			System.out.println("I am \"finally\" Block");
			try {
				fis.close();
				
			} catch (IOException e) {
				
				System.out.println("The file cannot be closed");
			}
			
		}
		
		
	}
	
}
