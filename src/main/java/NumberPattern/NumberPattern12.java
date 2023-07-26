package NumberPattern;

public class NumberPattern12 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 0; i < num; i++) {
			int p = 9;
			for (int j = i; j < num; j++) {
				System.out.print(p-- + " ");
			}
			System.out.println();
		}

	}

}
