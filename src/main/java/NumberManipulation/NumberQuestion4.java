package NumberManipulation;

//Check if a number is spy number or not. Means sum its digits equals the product of the digits. E.x 123. 1+2+3=1*2*3*;
public class NumberQuestion4 {

	public static void main(String[] args) {

		int num = 129;
		int snum = 0;
		int add = 0;
		int mul = 1;
		while (num != 0) {
			snum = num % 10;
			add = add + snum;
			mul = mul * snum;
			num = num / 10;
		}

		System.out.println(add + " " + mul);
		if (add == mul) {
			System.out.println("SPY number");
		} else {
			System.out.println("Not SPY number");
		}

	}

}
