package StringManipulation2;

//Print only the words starting with s in a sentence. 
public class StringQuestion4 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.startsWith("s")) {// words start with.
					System.out.println(word);
				}
				if (word.endsWith("o")) {// words ends with.
					System.out.println(word);
				}
				if (word.contains("he")) {// words contains.
					System.out.println(word);
				}

				word = "";
			}
		}

	}

}
