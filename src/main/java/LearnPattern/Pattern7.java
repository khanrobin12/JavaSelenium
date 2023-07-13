package LearnPattern;

public class Pattern7 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1; i <= num; i++) {

			for (int j = i; j <= num; j++) {

				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("  $ ");

			}
			System.out.println();

		}

		System.out.println("\n\n\n\n\n");

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

}
