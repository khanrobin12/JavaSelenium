package StringManipulation;

// find the longest word in a sentence. 

public class WordProblem8 {

	public static void main(String[] args) {

		String sentence = "find the longest word in a sentence";

		sentence = sentence + " ";

		String word = "";
		String lw = "";

		for (int i = 0; i < sentence.length(); i++) {

			char ch = sentence.charAt(i);

			if (ch != ' ') {

				word = word + ch;

			} else {
				if (word.length() > lw.length()) {
					lw = word;
				}
				word = "";
			}

		}

		System.out.println(lw);

	}

}
