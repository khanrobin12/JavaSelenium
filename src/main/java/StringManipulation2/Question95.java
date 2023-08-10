package StringManipulation2;

// Write a program to find the reverse of the String. 
public class Question95 {

	public static void main(String[] args) {

		String st = "Write a program to find the reverse of the String";

		String rev = "";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);

	}

}
