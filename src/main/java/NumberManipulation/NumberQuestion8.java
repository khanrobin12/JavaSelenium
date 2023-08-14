package NumberManipulation;

//Check if a number is neon number or not. where sum of digits of square of the number is equals to the number. EX--> 9,9*9=81, 9=8+1. 
public class NumberQuestion8 {

	public static void main(String[] args) {

		int num = 9, m = num;
		int nu = num * num, sum = 0;

		while (num != 0) {
			int d = num % 10;
			sum = sum + d;
			System.out.println(sum);
			num = num / 10;
		}
		if (sum == m) {
			System.out.println("Neon Number");
		} else {
			System.out.println("not Neon Number");
		}

	}

}
