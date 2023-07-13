package ClassMethodsInJava;

public class StringClass {
	public static void main(String[] args) {

		String name = "Alinoor";
		String name1 = new String("Robin");

		System.out.println(name);
		System.out.println(name1);

		int value = name.length();// it will provide total number of character.
		System.out.println(value);

		String lower = name.toLowerCase(); // it will make the string all lower case.
		System.out.println(lower);

		String upper = name.toUpperCase();// it will make the string all upper case.
		System.out.println(upper);

		String trim = name.trim();// it will delete all the extra space front and back of the string.
		System.out.println(trim);

		String substring = name.substring(2, 4);// it will make a substring from where to start and where to end.
		System.out.println(substring);

		String replace = name.replace('r', '!'); // it will replace one character or string to another.
		System.out.println(replace);

		boolean startwith = name.startsWith("noor");// it will check the string start with what.
		System.out.println(startwith);

		boolean endswith = name.endsWith("noor"); // it will check the string ends with what.
		System.out.println(endswith);

		char charat = name.charAt(6);// it will return the character which is in that index.
		System.out.println(charat);

		int indexof = name.indexOf('r'); // it will return the index which is in that character.
		System.out.println(indexof);

		int lastindexof = name1.lastIndexOf("in");// *******Confuse*****
		System.out.println(lastindexof);

		boolean equals = name.equals("robin");// it will compare the two string and return true or false.
		System.out.println(equals);

		boolean equalignorcase = name.equalsIgnoreCase("robin");// Compares this String to another String, ignoring case
																// considerations.
		System.out.println(equalignorcase);

		char ch[] = name.toCharArray();// seperate the individule char from the string and store them to the array.
		System.out.println(ch[2]);

		// *****************Escape Sequences*******************************************

		String escaprSequences1 = "\t Add a tab space";
		System.out.println(escaprSequences1);

		String escaprSequences2 = "sends cursor \r to next line";
		System.out.println(escaprSequences2);

		String escaprSequences3 = "next \n line";
		System.out.println(escaprSequences3);

		String escaprSequences4 = "page \f break";
		System.out.println(escaprSequences4);

		String escaprSequences5 = "\b backspace";
		System.out.println(escaprSequences5);

		String escaprSequences6 = "add \'single\' quotation marks around string";
		System.out.println(escaprSequences6);

		String escaprSequences7 = "add \"double\" quotation marks around string";
		System.out.println(escaprSequences7);

		String escaprSequences8 = "add \\ where needed";
		System.out.println(escaprSequences8);

	}

}
