package StringAtoZ;

import java.util.StringTokenizer;

//Case 10: StringBuilder class
//Case 11: StringTokenizer class

public class TestClass8 {

	public static void main(String[] args) {

		// StringBuffer vs StringBuilder

		// both are same. StringBuilder introduce java 1.5 version
		// StringBuffer is synchronized that means only one thread can enter at a
		// time.(performance decrease)
		// StringBuilder is not synchronized that means multiple thread can enter at the
		// same time. (performance increase)

		// StringTokenizer
		// StringROkenizer class belongs to java.util package(1.0 version)
		// it helps to split the data.
		// hasMoreElements() used to tokens are available
		// to read the token nextElement() used.

		StringTokenizer st = new StringTokenizer("hi sir class completed");
		while (st.hasMoreElements()) {
			String s = (String) st.nextElement();
			System.out.println(s);
		}

		StringTokenizer st1 = new StringTokenizer("h.i si.r cla.ss compl.eted", ".");

		while (st1.hasMoreTokens()) {

			String s2 = st1.nextToken();
			System.out.println(s2);

		}

	}

}
