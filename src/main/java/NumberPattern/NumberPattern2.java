package NumberPattern;

public class NumberPattern2 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1, p = 1; i <= num; i++, p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}

}
