package NumberPattern;

public class NumberPattern10 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 0; i < num; i++) {
			int p = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}

	}

}
