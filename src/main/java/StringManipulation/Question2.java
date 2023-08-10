package StringManipulation;

//Print ASCII code of each character of a String 

public class Question2 {

	public static void main(String[] args) {

		String st = "Print ASCII code of each character of a String";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);

			System.out.println(ch + "  ASCII Code   " + (byte) ch);
		}

	}

}
