package StringManipulation2;

//Pring all special words in a String. EX--> First and last char are same. 
public class StringQuestion6 {

	public static void main(String[] args) {
		String st = "Break the sentence Anna into word by word Bob";
		st = st + " ";
		String word = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				char f = word.charAt(0);
				char l = word.charAt(word.length() - 1);
				if (Character.toUpperCase(f) == (Character.toUpperCase(l))) {
					System.out.println(word);
				}
				word = "";
			}
		}

	}

}
