
public class Quickstart {
	static boolean isBestCourse = true;
	static byte smallNegativeNumber = -128;
	static byte smallPositiveNumber = 127;
	static short SomeOtherNumber = 256;
	static int largeNumber = 42000;
	static long largestNumber = 4200000000000000000L;
	static float largestDecimalNumber = 42000.42F;
	static char someLetter = 'H';
	static String someText = "OOP I Rocks!";

	public Quickstart() {
		
	}
	
	public  void varibales() {
		System.out.println(isBestCourse);
//	System.out.println(smallNegativeNMumber);
//	System.out.println(smallPositivNumber);
		System.out.println(SomeOtherNumber);
		System.out.println(largeNumber);
		System.out.println(largestNumber);
		System.out.println(largestDecimalNumber);
		System.out.println(someLetter);
		System.out.println(someText);

		System.out.println("Hello, World.");

		System.out.println(
				String.format("Our smallest numbers are bytes: %d and %d", smallNegativeNumber, smallPositiveNumber));
		System.out.println(String.format("After that we have a number with larger range: %d", SomeOtherNumber));

		System.out.println(String.format("Most commonly used are integers: %d", largeNumber));

		System.out.println(String.format(
				"In some cases the size of integers don't fit our use case..Then we have to take long which needs to be defined with an Lat the end of the number: %d",
				largestNumber));

		System.out.println(String.format(
				"When it comes to decimal numbers we can take float if we don't need that many decimal places: %f",
				largestDecimalNumber));
		System.out.println(String.format("If precision is mandatory and we have large numbers we can take doubles: Xf",
				largestDecimalNumber));

		System.out.println(String.format("We can work with single letters: %c", someLetter));

		System.out.println(String.format(
				"Or with a collection of letters, called a String. It's not a primitive type but commonly used: %s",
				someText));

		System.out.println(String.format(
				"If we want to store bool results we can do this with boolean variables. Is OOP I the best course?: Xb",
				isBestCourse));
	}
}
