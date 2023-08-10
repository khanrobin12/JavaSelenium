package JavaInterviewQuestions;

public class RemoveDuplicateChar {

	public static String removeDuplicateChar(String st) {
		String remove = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (remove.indexOf(ch) == -1) {
				remove += ch;
			}
		}
		System.out.println(remove);
		return remove;

	}

	public static void findDuplicateChar(String st) {

		char[] cararr = st.toCharArray();
		int count = 0;

		for (int j = 0; j < st.length(); j++) {
			for (int j2 = j + 1; j2 < st.length(); j2++) {

				if (cararr[j] == cararr[j2]) {
					System.out.println(cararr[j2]);
					count++;

				}

			}

		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		// removeDuplicateChar("Selenium");
		findDuplicateChar("abcbbcc");

		/*
		 * String st = "Saelniumli";
		 * 
		 * String newst = "";
		 * 
		 * for (int i = 0; i < st.length(); i++) { char ch = st.charAt(i);
		 * System.out.println(ch); System.out.println(newst.indexOf(ch)); if
		 * (newst.indexOf(ch) == -1) { newst = newst + ch; }
		 * 
		 * }
		 * 
		 * System.out.println(" " + newst);
		 */

	}

}
