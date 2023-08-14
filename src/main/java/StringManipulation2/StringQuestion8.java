package StringManipulation2;

//Find the shortest word in a sentence. 
public class StringQuestion8 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";
		String smell = st;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {

				if (word.length() < smell.length()) {
					smell = word;
				}

				word = "";
			}
		}
		System.out.println(smell);

	}

}
