package StringManipulation;

//Print each word of a sentence in a separate line. 
public class WordProblem1 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single record table";
		sentance = sentance + " ";

		String word = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				System.out.println(word);
				word = "";
			}

		}

	}

}
