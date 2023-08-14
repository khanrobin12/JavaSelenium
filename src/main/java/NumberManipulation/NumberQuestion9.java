package NumberManipulation;

// Check if a number is automorphic number or not. it is a number which is contained in the last digit(s) of its square. Ex--> 25 in 625. 
public class NumberQuestion9 {

	public static void main(String[] args) {

		int num = 25;
		int m = num * num;
		int flag = 0;

		while (num != 0) {
			int sn = num % 10;
			int sn1 = m % 10;
			if (sn != sn1) {
				flag++;
			}

			num = num / 10;
			m = m / 10;
		}
		if (flag == 0) {
			System.out.println("automorphic");
		} else {
			System.out.println("not automorphic");
		}

	}

}
//16:45 --14:52