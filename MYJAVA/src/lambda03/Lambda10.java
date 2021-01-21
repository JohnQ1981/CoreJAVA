package lambda03;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda10 {

	public static void main(String[] args) throws IOException {

		//Read the text from LambdaFile01 
		Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).forEach(System.out::println);

		System.out.println("==============");

		//read the text from the file LambdaFile01

		Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).toString().toUpperCase();

		Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("========");
		//read the first row only 1
		Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).limit(1).map(String::toLowerCase).forEach(System.out::println);
		System.out.println("===========");
		// second way
		System.out.println(Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).map(String::toLowerCase).findFirst());

		System.out.println("===========");
		//1st way
		Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).skip(2).limit(1).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("=======");
		//2nd way
		System.out.println(Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).skip(2).map(String::toUpperCase).findFirst());
		//System.out.println(Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).map(String::toLowerCase).findthird());


		//find the number of lines which the word "Lambda" is used
		System.out.println(Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).filter(t->t.toLowerCase().contains("lambda")).count());

		//Print all different words from the file in a list
		System.out.println(Files.lines(Paths.get("src/lambda03/LambdaFile01.txt")).
				map(t->t.toLowerCase().replace("_", " ")
						.split(" "))
				.flatMap(Arrays::stream).map(t->t.replaceAll("\\W", ""))
				.distinct().collect(Collectors.toList()));

		//count unique word used in the file
		System.out.println(Files
				.lines(Paths.get("src/lambda03/LambdaFile01.txt"))
				.map(t->t.toLowerCase().replace("_", " ")
						.split(" "))
				.flatMap(Arrays::stream).map(t->t.replaceAll("\\W", ""))
				.distinct().count());
		System.out.println("=======");
		//find number of the word "Lambda"

		System.out.println(Files
				.lines(Paths.get("src/lambda03/LambdaFile01.txt"))
				.map(t->t.toLowerCase().replace("_", " ")
						.split(" "))
				.flatMap(Arrays::stream).map(t->t.replaceAll("\\W", ""))
				.filter(t->t.equals("and")).count());

		System.out.println("=======");
		System.out.println(Files
				.lines(Paths.get("src/lambda03/LambdaFile01.txt"))
				.map(t->t.toLowerCase().replace("_", " ")
						.split(" "))
				.flatMap(Arrays::stream)
				.map(t->t.replaceAll("\\W", ""))
				.distinct().collect(Collectors.toList()));

	}

}
