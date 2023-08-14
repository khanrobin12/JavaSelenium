package StringManipulation2;

//Print the last characters of each word in a sentence. 
public class StringQuestion3 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				char ch2 = word.charAt(word.length() - 1);
				char ch3 = word.charAt(word.length() - 2);

				System.out.println(ch2 + "" + ch3);
				word = "";
			}
		}

	}

}
