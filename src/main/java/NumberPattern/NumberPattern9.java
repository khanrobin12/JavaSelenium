package NumberPattern;

//Print odd and even number in the pattern. 

public class NumberPattern9 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				if (i % 2 == 0) {
					System.out.print("2 ");
				} else {
					System.out.print("1 ");
				}

			}
			System.out.println();
		}
	}

}
