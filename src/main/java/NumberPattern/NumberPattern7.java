package NumberPattern;

public class NumberPattern7 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 1, p = num; i <= num; i++, p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

	}

}
