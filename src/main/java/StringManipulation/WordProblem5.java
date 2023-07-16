package StringManipulation;

//print only the word ending with ED in a sentence. 

public class WordProblem5 {

	public static void main(String[] args) {

		String sentence = "uniquely idenfify a record";
		sentence = sentence + " ";

		String word = "";

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch != ' ') {
				word = word + ch;

			} else {

				if (word.endsWith("rd")) {
					System.out.println(word);
				}
				word = "";
			}
		}
	}

}
