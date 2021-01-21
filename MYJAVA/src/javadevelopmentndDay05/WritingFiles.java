package javadevelopmentndDay05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) {
		//create folder
		//File folder1 = new File("FolderToWrtie/FileToWrite.txt");
		//		folder1.mkdir();

		//create file
		File file = new File("FolderToWrtie/FileToWrite.txt");
		//		try {
		//			file.createNewFile();
		//		} catch (IOException e) {
		//
		//			e.printStackTrace();
		//		}

		//		try {
		//			FileWriter fw = new FileWriter(file, true);
		//			BufferedWriter bw = new BufferedWriter(fw);
		//			bw.write("Hello World");
		//			bw.newLine();
		//			bw.write("Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class).\n The class from which the subclass is derived \n is called a superclass (also a base class or a parent class).\n"
		//					+ "\n"
		//					+ "Excepting Object, which has no superclass, every class has one and only one direct superclass (single inheritance). \nIn the absence of any other explicit superclass, every class \n is implicitly a subclass of Object.\n"
		//					+ "\n"
		//					+ "Classes can be derived from classes that are derived from classes that are derived from classes, and so on,\n  and ultimately derived from the topmost class, Object. Such a class is \n said to be descended from all the classes in the inheritance chain stretching back to Object.");
		//			bw.close();
		//		} catch (IOException e) {
		//
		//			e.printStackTrace();
		//		}

		//Recommended
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true ))) {


			bw.write("Hello World");
			bw.newLine();
			bw.write("Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class).\n The class from which the subclass is derived \n is called a superclass (also a base class or a parent class).\n"
					+ "\n"
					+ "Excepting Object, which has no superclass, every class has one and only one direct superclass (single inheritance). \nIn the absence of any other explicit superclass, every class \n is implicitly a subclass of Object.\n"
					+ "\n"
					+ "Classes can be derived from classes that are derived from classes that are derived from classes, and so on,\n  and ultimately derived from the topmost class, Object. Such a class is \n said to be descended from all the classes in the inheritance chain stretching back to Object.");
			//bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}




	}

}
