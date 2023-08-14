package NumberManipulation;

// Check if a number is special number or not. where sum of factorial of digit is equal to the number 145=1!+4!+5!
public class NumberQuestion91 {

	public static void main(String[] args) {

		int num = 145;
		int m = num;
		int sum = 0;
		while (num != 0) {
			int n = num % 10;
			// System.out.println(n);
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;

		}
		System.out.println(sum + "   " + m);
		if (sum == m) {
			System.out.println("Special #");
		} else {
			System.out.println("Not Special#");
		}
	}

}
