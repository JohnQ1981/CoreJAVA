package javadevelopmentday04;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		/*   --------HOW TO CREATE FILES--------
			 if you type just the name of a file, Java creates the file inside the project 
			 outside the src folder.
			 to see the file do not forget to Refresh the Project
		 * */
		//		File file1 = new File("FileOutOfSRC.txt");
		//
		//		file1.createNewFile();
		//		System.out.println("File is created inside the project , outside the SRC");

		//		File file2 = new File("src/FileUnderSRC.txt");
		//
		//		file2.createNewFile();
		//		System.out.println("File is created inside the SRC");

		//		File file3 = new File("src/javadevelopmentday04/FileUnderDay04.txt");
		//
		//		file3.createNewFile();
		//		System.out.println("File is created inside the javadevelopmentday04");

		//		File file4 = new File("/Users/jq/Documents/TaskFile.txt");
		//
		//		file4.createNewFile();	
		//		
		//		System.out.println("File is created inside the /Users/jq/Documents");


		/*
			 -----HOW TO CREATE FOLDERS-------
		 * 
		 * 
		 * */

		File folder1 = new File("FolderOutOfSRC/SubFolder1");
		folder1.mkdirs();
		System.out.println("Folder is created inside the project , outside the SRC");

		//Task: Create a folder under documents, name it as "MyFirstFolder"
		//      Create a sub-folder under "MyFirstFolder", name it as "MyFirstSubFolder"
		//      Create a file under "MyFirstFolder", name it as "FileOuter"
		//      Create a file under "MyFirstSubFolder", name it as "FileInner"


		File folder2 = new File("/Users/jq/Documents/MyFirstFolder/MyFirstSubFolder/FileInner.txt");
		folder2.createNewFile();
		System.out.println("Folder is created inside the project , outside the SRC");

	}

}
