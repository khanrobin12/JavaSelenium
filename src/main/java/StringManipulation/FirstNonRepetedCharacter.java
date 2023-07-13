package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		System.out.println("How to get a non repeted chrechter from a string");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = sc.nextLine().toLowerCase();
		sc.close();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		boolean b = false;

		for (int j = 0; j < str.length(); j++) {

			char ch = str.charAt(j);

			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}

		for (int k = 0; k < str.length(); k++) {
			char ch = str.charAt(k);
			if (map.get(ch) == 1) {
				System.out.println("First non repeated character in the given String is :" + ch);
				b = true;
				break;

			}

		}
	}

}
