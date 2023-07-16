package StringManipulation;

// write a program to swap first and last letter of each word of a sentence. 
public class WordProblem16 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single record table";
		sentance = sentance + " ";

		String word = "";
		String ns = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				char f = word.charAt(0);
				char l = word.charAt(word.length() - 1);
				String m = word.substring(1, word.length() - 1);
				ns = ns + l + m + f + " ";
				word = "";
			}

		}
		System.out.println(ns);

	}

}
