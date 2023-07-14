package StringManipulation;

// count the number of words in a sentence. 
public class WordProblem10 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single record table";
		sentance = sentance + " ";

		String word = "";
		int count = 0;

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				System.out.println(word);
				count++;
				word = "";
			}

		}
		System.out.println(count);

	}

}
