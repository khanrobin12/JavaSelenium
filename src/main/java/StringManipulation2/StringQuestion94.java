package StringManipulation2;

//Delete the word into in a sentence and print it. 
public class StringQuestion94 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String nw = "";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (!word.equals("into")) {
					nw = nw + word + " ";
				}
				word = "";
			}
		}
		System.out.println(nw);
	}

}
