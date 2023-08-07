package StringAtoZ;

// Case 1 : both are final classes. 
// String is group of characters enclose with double court"". 
// it is belongs to java.lang package. it is final class. 
// the default value is string is null. 

// String, StringBuffer, StringBuilder, StringTokenizer class. 
public class CreatingString {

	public static void main(String[] args) {
// by using sting variable

		String s1 = "ratan";
		System.out.println(s1);

// by using string class

		String s2 = new String("ratan");
		System.out.println(s2);

// by using character array

		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		String s3 = new String(ch);
		System.out.println(s3);

// by using char array (value, offset, count)
		String s4 = new String(ch, 2, 3);
		System.out.println(s4);

// by using byte array using unicode values

		byte[] b = { 65, 66, 67, 68, 69 };
		String s5 = new String(b);
		System.out.println(s5);

// by using by array (byte, offset, length)

		String s6 = new String(b, 1, 4);
		System.out.println(s6);

	}

}
