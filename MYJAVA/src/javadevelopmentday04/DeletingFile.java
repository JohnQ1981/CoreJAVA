package javadevelopmentday04;

import java.io.File;

public class DeletingFile {

	public static void main(String[] args) {

		File file1 = new File("/Users/jq/Documents/MyFirstFolder");

		file1.delete();
		System.out.println("FileInner is deleted");

	}

}
