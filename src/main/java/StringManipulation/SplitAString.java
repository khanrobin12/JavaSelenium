package StringManipulation;

public class SplitAString {

	public static void main(String[] args) {

		String splitex = "My name is alinoor and I am living in USA";

		String[] splitvalu = splitex.split(" ");

		for (int i = 0; i < splitvalu.length; i++) {
			System.out.println(splitvalu[i]);
		}
//
//		for (String e : splitvalu) {
//
//			System.out.println(e);
//		}

		String name = "alinoor";

		System.out.println(name.length());

		for (int j = 0; j < name.length(); j++) {
			System.out.println(name.charAt(j) + "index state of " + j);
		}

	}

}
