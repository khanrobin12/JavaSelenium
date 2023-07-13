package StringManipulation;

public class ReverseString {

	// *******Reverse a string*********

	public static void main(String[] args) {

		System.out.println("Using StringBuffer Class to reverse String");

		String st = "selenium";

		StringBuffer sb = new StringBuffer(st);
		StringBuffer rv = sb.reverse();
		System.out.println(rv);

		System.out.println("Using for loop to reverse String");

		st = "Alinoor";

		int len = st.length();
		System.out.println(len);

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + st.charAt(i);

		}
		System.out.println(rev);

	}

}
