package StringManipulation2;

//Template: Print each word of a sentence in a separate line. 
public class StringQuestion1 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				System.out.println(word);
				word = "";
			}
		}

	}

}
