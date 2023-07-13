package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveSpacialCharecterFromString {

	// ******How to get distinct or non-repeated characters from a String*********

	public static void main(String[] args) {

		String st = "abcdebce";

		int len = st.length();
		int i = 0;

		while (i < len) {

			char c = st.charAt(i);
			int firstIndex = st.indexOf(c);
			int lastIndex = st.lastIndexOf(c);

			if (firstIndex == lastIndex) {
				System.out.println(c + "                    " + st);

			}
			i++;

		}
//*******************************************************************************************
		System.out.println("How to get a non repeted chrechter from a string");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String uip = sc.nextLine().toLowerCase();
		sc.close();

		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		boolean b = false;

		for (int j = 0; j < uip.length(); j++) {

			char ch = uip.charAt(i);

			if (mp.get(ch) == null) {
				mp.put(ch, 1);
			} else {
				mp.put(ch, mp.get(ch) + 1);
			}

		}

		for (int k = 0; k < uip.length(); k++) {
			char ch = uip.charAt(k);
			if (mp.get(ch) == 1) {
				System.out.println("First non repeated character in the given String is :" + ch);
				b = true;
				break;

			}

		}

	}

}
