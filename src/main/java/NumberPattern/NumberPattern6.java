package NumberPattern;

public class NumberPattern6 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 1, p = num; i <= num; i++, p--) {
			for (int j = i; j <= num; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

	}

}
