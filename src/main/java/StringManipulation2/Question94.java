package StringManipulation2;

// Write a Program To Reverse The Case Of a String
public class Question94 {

	public static void main(String[] args) {

		String st = "Write a Program To Reverse The Case Of a String";
		String st1 = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (Character.isUpperCase(ch)) {
				st1 = st1 + Character.toLowerCase(ch);
			} else {
				st1 = st1 + Character.toUpperCase(ch);
			}

		}
		System.out.println(st1);

	}

}
//solve string programs in java 14:36 -->10:19
