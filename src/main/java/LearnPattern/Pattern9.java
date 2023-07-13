package LearnPattern;

public class Pattern9 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				if (i >= 2 && j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {

				if (k > 1 && i >= 2) {
					System.out.print(" ");
				} else {
					System.out.println("* ");
				}
			}

			System.out.println();

		}

	}

}
