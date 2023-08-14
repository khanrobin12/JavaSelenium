package StringManipulation2;

//Find the longest word in a sentence. 
public class StringQuestion7 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";
		String longest = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.length() > longest.length()) {
					longest = word;

				}
				word = "";
			}
		}
		System.out.println(longest);

	}

}
