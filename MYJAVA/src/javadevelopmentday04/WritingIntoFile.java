package javadevelopmentday04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {

	public static void main(String[] args) {


		File file = new File("src/javadevelopmentday04/FileToWrite.txt");


		//		try {
		//			file.createNewFile();
		//		} catch (IOException e) {
		//
		//			System.err.println(e.getMessage());
		//		}
		FileWriter fw;
		try {
			fw = new FileWriter(file , true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Java was easy." );
			bw.newLine();
			bw.write("If you think it is hard, dream the money which you will ear." );
			bw.newLine();
			bw.write("Everything can be easy if you study systematically." );
			bw.newLine();
			bw.write("Hello World");
			bw.newLine();

			bw.close();//do not forget.

		} catch (IOException e) {

			System.err.println("Some Errors occured while writing into the file");
		}



	}

}
