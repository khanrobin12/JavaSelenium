package JavaInterviewQuestions;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String st = "Seleniumm";
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {

			char ch1 = st.charAt(i);
			int ch2 = st.indexOf(ch1, i + 1);

			if (ch2 == -1) {
				stb.append(ch1);
			}

		}
		System.out.println(stb);
	}

}
