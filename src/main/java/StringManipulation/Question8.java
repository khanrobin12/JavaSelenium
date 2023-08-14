package StringManipulation;

//print the first UpperCase Character of a String. 
public class Question8 {

	public static void main(String[] args) {

		String st = "print the first UpperCase Character of a String";
		char ch = ' ';
		int count = 0;

		for (int i = 0; i < st.length(); i++) {

			ch = st.charAt(i);

			if (Character.isUpperCase(ch)) {
				count++;
				System.out.println(ch);
			}

			if (count == 2) {
				break;
			}

		}

	}

}
