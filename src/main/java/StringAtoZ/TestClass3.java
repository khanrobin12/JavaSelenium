package StringAtoZ;

//case 3 : String is immutable  and StringBuffer is mutable. (modifiable) 
public class TestClass3 {

	public static void main(String[] args) {

		// immutable

		String name = "ali";
		name.concat("noor");
		System.out.println(name);// ali

		// concat() used to combine the two obj return new string.
		name = name.concat("khan");
		System.out.println(name);// alikhan.

		String s1 = "ratan";
		System.out.println(s1);
		s1 = s1.concat("soft");// new obj is created internally
		System.out.println(s1);

		// mutable
		StringBuffer buffer = new StringBuffer("khan");
		buffer.append("robin");
		System.out.println(buffer);

// case 4: is equals() use for reference comparison 
		// String class overriding equals() perform content comparison
		// StringBuffer class not overriding equals() perform reference comparison.
		// == operator always meant for reference comparison.

		// String overriding equals().
		String sb1 = "ali";
		String sb2 = "ali";
		System.out.println(sb1.equals(sb2));// true

		String sb3 = new String("noor");
		String sb4 = new String("noor");
		System.out.println(sb3.equals(sb4));// true

		// StringBuffer is not overriding equals().

		StringBuffer sb5 = new StringBuffer("khan");
		StringBuffer sb6 = new StringBuffer("khan");
		System.out.println(sb5.equals(sb6));// false

	}

}
