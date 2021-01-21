package lambda03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda06 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Alo");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Mariano");
		list.add("Alberto");
		list.add("Tucker");
		list.add("Christ");
		soB(list);

	}
	//create a method to print the length of the every element
	// in the following format
	//Ali: 3, Mark:4  and in order by their length

	public static void soB(List<String>list) {

		list.stream().
		sorted(Comparator.comparing(t->t.toString().length())).
		map(t->t+" : "+ t.length()).
		forEach(System.out:: println);

	}


}
