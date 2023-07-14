package StringManipulation;

public class WordProblem14 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single record table";
		sentance = sentance + " ";

		String word = "";
		int count = 0;
		String nw = "";

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {
				count++;
				if (count % 2 == 0) {
					nw = nw + word.toUpperCase() + " ";

				}

				word = "";
			}

		}
		System.out.println(nw);
	}

}
