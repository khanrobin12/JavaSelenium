package LearnPattern;

public class Pattern6 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int l = 1; l < num; l++) {

			for (int m = 1; m <= l + 1; m++) {
				System.out.print("  ");
			}

			for (int n = l; n <= num - 1; n++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
