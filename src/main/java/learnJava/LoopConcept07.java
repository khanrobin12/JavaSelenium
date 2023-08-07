package learnJava;

public class LoopConcept07 {

	public static void main(String[] args) {

		// while loop
		// when number of iterations are not fixed --while loop
		// total links/images on the page
		// webtable pagination 1 2 3 4...next.
		// webelement is loading on the page
		// pageload timeout.
		// calendar:
		int i = 1;
		System.out.println("before" + i);
		while (i <= 10) {
			System.out.println(i);
			i++;
			// i = i + 1;
			// ++i;
		}

		int k = 1;
		while (true) {
			System.out.println("welcome to HOtel Taj");
			if (k == 5) {
				break;
			}
			k++;

		}

		// for loop
		// when number of iterations are fixed -- for loop
		// month drop down ---> 1 to 12.
		// Array, Arraylist.
		// read data from excel file.

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}

		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println(ch + "         " + (int) ch);
		}

		// do while loop
		// it will run once before it checks the condition.

		int z = 0;
		do {
			System.out.println(z);
			z++;
		} while (z < 5);

	}

}
