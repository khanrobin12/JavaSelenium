package StringManipulation;

//Print each character of the String in separate line. 
public class Question1 {

	public static void main(String[] args) {

		String st = "Print each character of the String in separate line";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);
			System.out.println(ch);
		}

	}

}
