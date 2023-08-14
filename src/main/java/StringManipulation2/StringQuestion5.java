package StringManipulation2;

// Print only words having 3 characters in a sentence. 
public class StringQuestion5 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.length() == 3) {
					System.out.println(word);
				}
				word = "";
			}
		}

	}

}
