package StringManipulation;

public class StringClass1 {

	public static void main(String[] args) {

		String name = "how too get aatt word";
		name = name + " ";

		String word = "";

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);
			// System.out.println(ch);

			if (ch != ' ') {
				word = word + ch;

			} else {

				// System.out.println(word); // printing each word separately from a sentence.
				// System.out.println(word.charAt(0));//printing first character of each word in
				// System.out.println(word.substring(0, 2));//printing the first 2 characters of
				// each word in a sentence.
				/*
				 * if (word.toLowerCase().startsWith("w")) System.out.println(word);// print
				 * only the words containing w in a sentence. endsWith(); contains();
				 */

				/*
				 * if (word.length() == 3) { System.out.println(word); } //print only words
				 * having 3 character in a sentance.
				 */

				word = "";
			}
		}

	}

}
