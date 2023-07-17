package JavaInterviewQuestions;

//Reverse a String Using Java

public class ReverseString {

	public static void main(String[] args) {

		// 1st Way
		String st = "Selenium";
		char arr[] = st.toCharArray();

		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}

		// 2nd
		System.out.println("\n\n");
		String st1 = "QTP";

		for (int j = st1.length() - 1; j >= 0; j--) {
			System.out.print(st1.charAt(j));

		}

		// 3rd
		System.out.println("\n\n");
		String st3 = "manual";
		StringBuffer sb = new StringBuffer(st3);
		System.out.print(sb.reverse());

		// 4th
		System.out.println("\n\n");
		String st4 = "Database";
		StringBuilder sbuil = new StringBuilder(st4);
		System.out.println(sbuil.reverse());

	}

}
