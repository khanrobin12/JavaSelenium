package LearnPattern;

public class Pattern8 {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= num; k++) {
				System.out.print("* ");
			}
			for (int l = i; l < num; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
