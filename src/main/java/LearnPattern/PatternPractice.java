package LearnPattern;

public class PatternPractice {

	public static void main(String[] args) {

		int num = 5;
		for (int a = 1; a <= num; a++) {
			for (int b = 0; b < num; b++) {
				System.out.print("* ");

			}
			System.out.println();
		}
//#################################################################
		System.out.println("\n\n");

		for (int c = 1; c <= num; c++) {

			for (int d = 1; d <= c; d++) {
				System.out.print("* ");
			}
			System.out.println();

		}
//################################################################
		System.out.println("\n\n");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();

		}
//###############################################################
		System.out.println("\n\n");

		for (int c = 1; c <= num; c++) {

			for (int d = 1; d <= c; d++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();

		}

//###############################################################
		System.out.println("\n\n");

	}

}
