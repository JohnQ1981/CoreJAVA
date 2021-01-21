package javadevelopmentndDay05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {

	/*
		 1) Scanner cannot be used in multi -threading
		 BufferReader is multi-threaded.

		  2) Scanner cannot be used in synchronization.
		  	BufferReader is synchronized.
		  3) Scanner is used with small data till 1 KB
		  	BufferedReader can be used with larder data till 8 KB.
		  4)Scanner is slower than BufferedReader.

	 * */

	public static void main(String[] args) {

		// 1. Way to read file. 
		//		try(BufferedReader br = new BufferedReader(new FileReader("FolderToWrite/FileToWrite.txt"))){
		//
		//			String line;
		//
		//			while((line = br.readLine())!= null) {
		//
		//				System.out.println(line);
		//			}
		//
		//		} catch (FileNotFoundException e) {
		//
		//			e.printStackTrace();
		//		} catch (IOException e) {
		//
		//			e.printStackTrace();
		//		}
		//		
		//2.Way to read a file.

		//		try(Scanner scan = new Scanner(new File ("FolderToWrite/FileToWrite.txt"))){
		//
		//			String line;
		//			while(scan.hasNext()) {
		//				line = scan.nextLine();
		//				System.out.println(line);
		//
		//			}
		//
		//		} catch (FileNotFoundException e) {
		//
		//			e.printStackTrace();
		//		}


		//3. Way to read a file. Reading the text character by character.

		try(FileInputStream fis = new FileInputStream("FolderToWrite/FileToWrite.txt")){
			int k;
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
