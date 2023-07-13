package learnJava;

public class ConditionalStatement_If_Else_Switch {

	public static void main(String[] args) {

		// if else statement will check only (True or False)=boolean

		int a = 5;
		int b = 10;
		int c = 15;

		if (a == b) {
			System.out.println("this is true");
		} else {
			System.out.println("this is not true");
		}

		if (true) {
			System.out.println("Dead coad example");
		} else {
			System.out.println("This is the dead code");// dead code.
		}

		boolean bool = true;
		if (bool) {
			System.out.println("selenium");
		} else {
			System.out.println("QTP");
		}

		boolean test = true;

		if (!test) {
			System.out.println("testing is done");

		} else {
			System.out.println("testing is not done");

		}

		int number = 90;
		if (number <= 100) {
			System.out.println("Calculating your marks");
			if (number >= 90) {
				System.out.println("GREAD A");
			}

		}

		String browserName = "Chrome";
		switch (browserName) {
		case "Chrome":
			System.out.println("lunch chrome driver");
			break;
		case "FireFox":
			System.out.println("lunch FireFox driver");
			break;
		case "Safari":
			System.out.println("lunch Safari driver");
			break;
		case "InternetExplorer":
			System.out.println("lunch IE driver");
			break;
		default:
			System.out.println("Please pass the right driver");
			break;
		}

		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			System.out.println("lunch chrome driver");
		} else if (browserName.equals("FF")) {
			System.out.println("lunch FF driver");
		} else if (browserName.equals("IE")) {
			System.out.println("lunch IE driver");
		} else if (browserName.equals("Ophera")) {
			System.out.println("lunch Ophera driver");
		} else {
			System.out.println("Please define a right driver");
		}

	}

}
