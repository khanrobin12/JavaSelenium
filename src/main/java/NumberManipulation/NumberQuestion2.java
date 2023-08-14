package NumberManipulation;

//reverse a number
public class NumberQuestion2 {

	public static void main(String[] args) {

		int num = 2608, rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

	}

}
