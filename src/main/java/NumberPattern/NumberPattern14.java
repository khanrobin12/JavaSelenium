package NumberPattern;

public class NumberPattern14 {

	public static void main(String[] args) {

		int num = 9, p = 1;

		for (int i = 0; i < num; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}

	}

}
