package StringManipulation;

//change red with blue in a sentence and print it. 

public class WordProblem12 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single record table";
		sentance = sentance + " ";

		String word = "";
		String nw = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				if (word.equals("will")) {
					nw = nw + "shall" + " ";
				} else {
					nw = nw + word + " ";
				}
				word = "";
			}

		}
		System.out.println(nw);

	}

}
