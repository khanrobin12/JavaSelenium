package StringManipulation2;

//Change Red with Blue in a sentence and print it. 
public class StringQuestion93 {

	public static void main(String[] args) {

		String st = "Break the sentence into word by word";
		st = st + " ";
		String newsen = "";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {

				if (word.equals("word")) {
					newsen = newsen + "part" + " ";
				} else {
					newsen = newsen + word + " ";
				}
				word = "";
			}
		}
		System.out.println(newsen);

	}

}
