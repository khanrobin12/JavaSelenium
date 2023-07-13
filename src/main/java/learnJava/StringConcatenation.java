package learnJava;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println(a + b); // perform mathematical operation. =30

		String x = "hello";
		String y = "Selenium";
		System.out.println(x + y); // perform concatenation operation. = helloSelenium

		System.out.println(a + x); // 10hello
		System.out.println(a + b + x + y); // 30helloSelenium
		System.out.println(x + y + a + b); // helloSelenium1020
		System.out.println(x + y + (a + b));// helloSelenium30
		System.out.println(a + b + x + y + (a + b));// 30helloSelenium30

		double c = 12.33;
		double d = 23.44;

		System.out.println(x + y + c + d);// helloSelenium12.3323.44
		System.out.println(x + y + a + b + c + d); // helloSelenium102012.3323.44

		char g = 'm';
		char p = 'n';
		String l = "testing";
		String u = "automation";

		System.out.println(g + p);// 219 adding ASCII value.
		System.out.println(g + p + l + u);// 219testingautomation

		System.out.println('a'); // a
		System.out.println('a' + 'b'); // 195 it will do mathematical operator.

		System.out.println((byte) 'a');// 97 print ASCII value
		System.out.println((int) 'b'); // 98

		int s1 = 100;
		int s2 = 200;

		System.out.println("The value of s1 is :" + s1);// The value of s1 is :100
		System.out.println("The value of s1 is :" + s2);// The value of s1 is :200
		System.out.println("The value of s1 is :" + s2 + s1);// The value of s1 is :200100

		System.out.println(9 / 2);// 4 both number are integer.
		System.out.println((float) 9 / 2);// 4.5
		System.out.println(9.0 / 2);// 4.5 one number is double.
		System.out.println(0 / 9);// 0
		// System.out.println(9 / 0);// exception java.lang.ArithmeticException:
		System.out.println(9.9 / 0); // Infinity
		System.out.println(9 / 0.0);// Infinity
		// System.out.println(0 / 0);// exception java.lang.ArithmeticException:
		System.out.println(0.0 / 0.0); // NaN (not a number)
		System.out.println(0.0 / 2.0); // 0.0

	}

}
