package NumberManipulation;

// Print all digits of a number 268 on different lines. 
public class NumberQuestion1 {

	public static void main(String[] args) {

		int num = 2860, m = num;
		int rev = 0;

		while (num != 0) {

			int d = num % 10;
			System.out.println(d);
			rev = rev + d;
			num = num / 10;
		}

	}

}
