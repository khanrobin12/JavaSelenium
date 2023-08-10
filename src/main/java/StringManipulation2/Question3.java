package StringManipulation2;

//Print only UpperCase characters of a String & count it

public class Question3 {

	public static void main(String[] args) {

		String st = "Print only UpperCase characters of a String";
		int count = 0, countlow = 0, countsp = 0;

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);

			if (Character.isUpperCase(ch)) {
				count++;
				System.out.println(ch);
			} else if (Character.isLowerCase(ch)) {
				countlow++;
			} else {
				countsp++;
			}

		}
		System.out.println(count);
		System.out.println(countlow);
		System.out.println(countsp);

	}

}
