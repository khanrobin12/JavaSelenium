package StringAtoZ;

//Case 8: String class Methods. 
public class TestClass6 {

	public static void main(String[] args) {

		String s1 = "Alinoor";
		System.out.println(s1.charAt(2));// Return char
		System.out.println(s1.indexOf('o'));// Return int
		System.out.println(s1.lastIndexOf('o'));// Return int last occurrence of o
		System.out.println(s1.length());// Return int

		String s2 = "hi sir how r you";
		System.out.println(s2.startsWith("hi"));// return boolean
		System.out.println(s2.endsWith("you"));// return boolean.
		System.out.println(s2.contains("how"));// return boolean.

		// method chaining
		String s3 = "  ratan   ";
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		System.out.println(s3.trim().substring(2).length());
		System.out.println(s3.trim().substring(0, 3));// substring() include starting index but exclude ending index.

		// split

		String s4 = "hi sir how are u";
		String[] s5 = s4.split(" ");
		for (String s6 : s5) {
			System.out.println(s6);
		}

		// length variable vs length() method.

		int[] a = { 10, 20, 30, 40 };
		System.out.println(a.length);// length variable to find out length of the array.

		String b = "alinoor";
		System.out.println(b.length());// length() is used to find out length of the String.

	}
}
