package StringManipulation;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {

		// find the duplicate character in java.

		String name = "Selenium";

		char arr[] = name.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}

		}
	}

}
