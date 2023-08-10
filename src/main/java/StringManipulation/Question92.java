package StringManipulation;

//Create a new string with digits first and then characters. 
public class Question92 {

	public static void main(String[] args) {
		String st = "khanrobin12";

		String dig = "", str = "";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);
			if (Character.isAlphabetic(ch)) {
				str += ch;
			} else if (Character.isDigit(ch)) {
				dig += ch;
			}
		}
		System.out.println(dig + str);

	}

}
