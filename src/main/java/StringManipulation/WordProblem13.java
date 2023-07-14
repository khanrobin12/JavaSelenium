package StringManipulation;

//delete the word red in a sentence and print it. 

public class WordProblem13 {

	public static void main(String[] args) {

		String sentance = "single record table shall will be related single record table";
		sentance = sentance + " ";

		String word = "";
		String nw = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				if (!word.equals("shall")) {
					nw = nw + word + " ";
				}

				word = "";
			}

		}
		System.out.println(nw);

	}

}
