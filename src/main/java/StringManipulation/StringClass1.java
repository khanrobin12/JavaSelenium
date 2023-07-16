package StringManipulation;

public class StringClass1 {

	public static void main(String[] args) {

		String word = "Seleniumm";
		char[] arr = word.toCharArray();
		int len = word.length();
		int count = 0;

		for (int i = len - 1; i >= 0; i--) {
			for (int j = i + 1; j < len; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + "       ocurrance");
					break;
				}
			}
		}

	}

}
