package NumberPattern;

//Number pattern increment by 2. 

public class NumberPattern8 {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1, p = 0; i <= num; i++, p += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

	}

}
