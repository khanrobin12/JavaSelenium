package NumberManipulation;

//check if a number is palindrome or not. 
public class NumberQuestion3 {

	public static void main(String[] args) {

		int num = 252;
		int n = num;
		int rev = 0;

		while (num != 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}

		System.out.println(rev);
		System.out.println(n);
		if (rev == n) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palandrom");
		}

	}

}
