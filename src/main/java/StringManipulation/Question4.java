package StringManipulation;

//Print only LowerCase Characters of a String. 
public class Question4 {

	public static void main(String[] args) {

		String st = "Print only LowerCase Characters of a String";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);

			if (Character.isLowerCase(ch)) {
				System.out.println(ch);
			}
		}

	}

}
