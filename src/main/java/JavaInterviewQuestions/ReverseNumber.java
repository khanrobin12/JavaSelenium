package JavaInterviewQuestions;

public class ReverseNumber {

	// *******Reverse a Number*********

	public static void main(String[] args) {

		// *************Using While loop********************

		int num = 1234;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		// ************Using String Buffer Class

		int num1 = 56789;

		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);

	}

}
