package StringManipulation;

//Print only words having 3 characters in a sentence. 

public class WordProblem6 {

	public static void main(String[] args) {

		String sentence = "Print only one words having 3 characters in a sentence";

		sentence = sentence + " ";

		String word = "";

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

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
