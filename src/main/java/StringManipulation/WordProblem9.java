package StringManipulation;

//find  if the word or exists in a string. 
public class WordProblem9 {

	public static void main(String[] args) {

		String sentance = "single record table will be related single be record table";
		sentance = sentance + " ";

		String word = "";
		int count = 0;

		for (int i = 0; i < sentance.length(); i++) {

			char ch = sentance.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				if (word.equalsIgnoreCase("be")) {
					System.out.println(word);
					count++;
				}
				word = "";
			}

		}

		System.out.println(count);
		if (count > 0) {
			System.out.println("word exist");
		} else {
			System.out.println("word doesn't exist");
		}

	}

}
