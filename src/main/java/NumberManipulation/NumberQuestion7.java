package NumberManipulation;

//Check if a number is duck number or not. A number which has zeroes present in it. E.x-> 402,208
public class NumberQuestion7 {

	public static void main(String[] args) {

		int num = 346076, snum = 0, count = 0;

		while (num != 0) {
			snum = num % 10;
			if (snum == 0) {
				count++;
			}
			num = num / 10;
		}
		if (count > 0) {
			System.out.println("Duck number");
		} else {
			System.out.println("not a Duck number");
		}

	}

}
