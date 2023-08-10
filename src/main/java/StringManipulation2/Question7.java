package StringManipulation2;

//Print only Sp@ci@l characters of a String#. 

public class Question7 {

	public static void main(String[] args) {

		String st = "Print only Sp@ci@l cha!@#$%^&*(:,racters of a String#";
		st = st.replace(" ", "");

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				System.out.println(ch);
			}
		}

	}

}
