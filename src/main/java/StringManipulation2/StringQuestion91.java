package StringManipulation2;

// Count the number of words in a sentence. 
public class StringQuestion91 {

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
				count++;
				word = "";
			}
		}
		System.out.println(count);
	}

}
