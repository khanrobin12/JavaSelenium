package StringManipulation;

//write a program to capitalize each word of a sentence. 
public class WordProblem15 {

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
				char f = word.charAt(0);
				f = Character.toUpperCase(f);
				nw = nw + f + word.substring(1) + " ";
				word = "";
			}

		}
		System.out.println(nw);

	}

}
