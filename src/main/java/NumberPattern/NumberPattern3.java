package NumberPattern;

public class NumberPattern3 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1, p = 1; i <= num; i++, p++) {
			for (int j = i; j <= num; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

	}

}
