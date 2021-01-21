package lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda08 {
	public static void main(String[] args) {


		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 92, 144);
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		System.out.println(checkScore(courseList));
		System.out.println(checkWordTurkish(courseList));
		System.out.println(checkCourseNameAcH(courseList));
		System.out.println(Arrays.toString(sortBySeasonAndAverageScore(courseList).toArray()));
		sortBySeasonAndAverageScore2(courseList);
		System.out.println(sortByName(courseList));
		System.out.println(sortListSkip(courseList));
		System.out.println(getMaxAvCourse(courseList));
		System.out.println(getMaxAvCourse2(courseList));
		System.out.println(numberOfStGre95(courseList));
		System.out.println(findAve(courseList));
	}


	private static List<Course> courseList() {
		// TODO Auto-generated method stub
		return null;
	}


	//create a method to check if all average scores greater than 91

	public static boolean checkScore(List<Course> list) {
		return list.stream().allMatch(t->t.getAverageScore()>91);

	}
	//create a method to check if at least one of the course name contains
	//'Turkish' word
	public static boolean checkWordTurkish(List<Course> list) {

		return list.stream().anyMatch(t->t.getCourseName().contains("Turk"));
	}

	//create a method to print the course name which average score is the 
	//highest
	public static Optional<Course> checkCourseNameAcH(List<Course> list) {
		return list.stream().
				sorted(Comparator.comparing(Course::getAverageScore).
						reversed()).
				findFirst();

	}
	//sort the list elements according to the season and average score
	public static Stream<Course> sortBySeasonAndAverageScore(List<Course> list) {
		return list.stream().sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore));

	}

	public static void sortBySeasonAndAverageScore2(List<Course> list) {
		list.stream().
		sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore)).
		forEach(System.out::println);

	}
	//sort the list elements according to the name number of
	//students and limit elements by two
	public static List<Course> sortByName(List<Course> list){
		return list.stream().
				sorted(Comparator.comparing(Course::getCourseName).thenComparing(Course::getNumberOfStudents)).
				limit(2).collect(Collectors.toList());

	}

	//sort the list elements according to the average score, skip fist 3
	public static List<Course> sortListSkip(List<Course> list){
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(1).
				collect(Collectors.toList());

	}
	public static List<Course> sortListSkip1(List<Course> list){
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(1).limit(1).

				collect(Collectors.toList());

	}
	//get the course which has max average score
	public static List<Course>  getMaxAvCourse(List<Course> list){
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).
				limit(1).collect(Collectors.toList());
	}

	public static Optional<Course>  getMaxAvCourse2(List<Course> list){
		return list.stream().max(Comparator.comparing(Course::getAverageScore));
		//collect(Collectors.toList());	
	}

	//Find the sum of the number of students whose average grades are more than 95
	public static int  numberOfStGre95(List<Course> list){
		return list.stream().filter(t->t.getAverageScore()>95).mapToInt(t->t.getNumberOfStudents()).sum();
	}
	//Find the average of the number of students whose average grades are more than 93
	public static OptionalDouble findAve(List<Course> list) {
		return list.stream().filter(t->t.getAverageScore()>93).mapToDouble(t->t.getNumberOfStudents()).average();
	}
}

