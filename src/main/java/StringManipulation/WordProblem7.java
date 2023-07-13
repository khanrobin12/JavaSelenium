package StringManipulation;

//Pring all special words in a string. 

public class WordProblem7 {

	public static void main(String[] args) {

		String sentence = "my mom and dad are my heroes";
		sentence = sentence.toUpperCase() + " ";

		String word = "";

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {

				char first = word.charAt(0);
				char last = word.charAt(word.length() - 1);
				if (first == last) {
					System.out.println(word);
				}

				word = "";
			}
		}

	}

}
