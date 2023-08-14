package NumberManipulation;

// check if a number is niven/harshad number or not. A number which is divisible by the sum of its digit. EX-> 156=1+5+6=12
public class NumberQuestion6 {

	public static void main(String[] args) {

		int num = 156, n = num, sn = 0, sum = 0;

		while (num != 0) {
			sn = num % 10;
			sum = sum + sn;
			num = num / 10;
		}

		if (n % sum == 0) {
			System.out.println("niven/harshad");
		} else {
			System.out.println("not niven/harshad");
		}

	}

}
