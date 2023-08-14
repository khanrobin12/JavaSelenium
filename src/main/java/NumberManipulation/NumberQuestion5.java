package NumberManipulation;

//Check if a number is special number or not. Sum of digits plus product of digit it is equal to original number. e.g 59=5+9+5*9
public class NumberQuestion5 {

	public static void main(String[] args) {

		int num = 59, n = num, sum = 0, pro = 1;

		while (num != 0) {
			int m = num % 10;
			sum = sum + m;
			pro = pro * m;

			num = num / 10;
		}

		if (sum + pro == n) {
			System.out.println("Special Number");
		} else {
			System.out.println("Not Special Number");
		}

	}

}
