package StringManipulation2;

// Count the number of words ending with d in a sentence. 
public class StringQuestion92 {

	public static void main(String[] args) {
		String st = "Break the sentence into word by word";
		st = st + " ";
		String word = "";
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.endsWith("d")) {
					count++;
				}
				word = "";
			}
		}
		System.out.println(count);

	}

}
