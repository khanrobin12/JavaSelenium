package StringManipulation2;

// write a program to find if a String is palindrome(mom,dad)
public class Question96 {

	public static void main(String[] args) {

		String st = "mom";
		String rev = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}

		if (st.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not");
		}

	}

}
