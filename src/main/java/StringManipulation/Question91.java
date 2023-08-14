package StringManipulation;

// find the duplicate character of a String. 
public class Question91 {

	public static void main(String[] args) {

		String st = "find the duplcate char n a strng";
		st = st.replace(" ", "");

		int count = 0;

		char[] arr = st.toCharArray();
		xLoop: for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
					count++;
					break;
				}
				if (count > 1) {

					break xLoop;
				}

			}

		}

	}

}
