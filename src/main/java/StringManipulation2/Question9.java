package StringManipulation2;

//Count a certain character of a String or vowel. 
public class Question9 {

	public static void main(String[] args) {

		String st = "Count a certain character of a String";
		st = st.toLowerCase();
		int count = 0;

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
