package NumberPattern;

public class NumberPattern5 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 1, p = 1; i <= num; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(p + " ");
			}
			for (int j = i; j <= num - 1; j++) {
				System.out.print(p + " ");
			}

			System.out.println();
		}

	}

}
