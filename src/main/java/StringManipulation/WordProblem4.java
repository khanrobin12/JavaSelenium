package StringManipulation;

//Print only the words starting with i in a Sentence. 

public class WordProblem4 {

	public static void main(String[] args) {

		String sentence = "define prerequisite items must be icomplite";
		sentence = sentence + " ";

		String word = "";
		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {

			char ch = sentence.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.toLowerCase().startsWith("i")) {
					System.out.println(word);
					count++;
				}
				word = "";
			}

		}
		System.out.println(count);

	}

}
