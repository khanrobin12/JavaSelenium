package StringManipulation;

//print the first 2 characters of each word in a sentence. 

public class WordProblem3 {

	public static void main(String[] args) {

		String sentance = "Uniquely identify records but allow one null value";
		sentance = sentance + " ";
		String word = "";

		for (int i = 0; i < sentance.length(); i++) {
			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {
				System.out.println(word.substring(0, 2));
				word = "";
			}
		}

	}

}
