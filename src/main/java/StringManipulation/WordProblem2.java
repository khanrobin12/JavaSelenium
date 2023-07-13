package StringManipulation;

//Print first character of each word in a sentance. 

public class WordProblem2 {

	public static void main(String[] args) {

		String sentance = "i love you";
		sentance = sentance + " ";
		String word = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {
				System.out.println(word.charAt(0));
				word = "";
			}

		}

	}

}
