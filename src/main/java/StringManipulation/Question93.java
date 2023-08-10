package StringManipulation;

// Create a New String After Removing All Spaces In a String.
public class Question93 {

	public static void main(String[] args) {
		String st = "Create a New String After Removing All Spaces In a String";
		String ne = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (!Character.isWhitespace(ch)) {
				ne = ne + ch;
				System.out.print(ch);
			}
		}

	}

}
