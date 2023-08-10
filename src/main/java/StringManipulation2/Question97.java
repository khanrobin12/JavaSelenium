package StringManipulation2;

// String Encoding Program Piglatin. (eat =(vowel) eat+way, clear =(consonant)e+ends+beginning+ay.(ear+cl+ay) 
public class Question97 {

	public static void main(String[] args) {

		String st = "khanrobin";
		// System.out.println(st.substring(0, 2));

		// System.out.println(st.substring(2));
		String pig = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (i == 0) {
					pig = st + "way";
					break;
				} else {
					pig = st.substring(i) + st.substring(0, i) + "ay";
					break;

				}

			}
		}
		System.out.println(pig);
	}

}
