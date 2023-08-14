package StringManipulation2;

//Find if the word "INTO" exists in a String. 
public class StringQuestion9 {

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
				if (word.equalsIgnoreCase("into")) {
					count++;
				}
				word = "";
			}

		}
		if (count != 0) {
			System.out.println("Found           " + count);
		} else {
			System.out.println("Not Found");
		}
	}

}
