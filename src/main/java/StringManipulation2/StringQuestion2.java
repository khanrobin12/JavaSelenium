package StringManipulation2;

//Print the first character of each word in a sentence and first 2 character.
public class StringQuestion2 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				char ch2 = word.charAt(0);// for the 1st char.
				String st2 = word.substring(0, 2);// for 1st two char.
				System.out.println(ch2);
				System.out.println(st2);
				word = "";
			}
		}

	}

}
