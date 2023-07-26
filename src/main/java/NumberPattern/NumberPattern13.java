package NumberPattern;

//decrementing columns 

public class NumberPattern13 {

	public static void main(String[] args) {

		int num = 9;

		for (int i = 0, k = num; i < num; i++, k--) {
			int p = k;
			for (int j = i; j < num; j++) {
				System.out.print(p-- + " ");
			}
			System.out.println();
		}

	}

}
