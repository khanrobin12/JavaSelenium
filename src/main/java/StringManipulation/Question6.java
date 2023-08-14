package StringManipulation;

//Print23 only digit from a string78 
public class Question6 {

	public static void main(String[] args) {
		String st = "Print23 only digit from a string78";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);
			if (Character.isDigit(ch)) {
				System.out.println(ch);
			}
		}
	}

}
