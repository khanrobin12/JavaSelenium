package StringManipulation;

// Count the number of words ending with D in a sentence. 

public class WordProblem11 {

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

				if (word.endsWith("d")) {
					count++;
				}
				word = "";
			}

		}
		System.out.println(count);

	}

}
