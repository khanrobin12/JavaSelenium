package StringAtoZ;

//Case 6: Conversion process. 
// to store house#, Street#, city, state, zipcode from a form to database 
// we need to store as string. Process String --> StringBuffer -->String. 

public class TestClass5 {

	public static void main(String[] args) {

		String s = "alinoor";
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();
		System.out.println(sb);
		String sb1 = sb.toString();
		System.out.println(sb1);

//Case 7: equals() vs compareto(). 
		// equals() is in Object class perform reference comparison. it return type
		// boolean
		// String class overriding equals() perform content comparison.
		// StringBuffer is not overriding equals(). it used Object class equal() perform
		// reference comparison.

		// compateTo() user for compare two object. it is belong to String class. it
		// returns type int.
		// if both string are equal returns 0 and if its not equal it returns positive
		// value or negative value.
		// if first char of first String bigger then the first char of second String
		// returns positive value. (the different will be print)
		// if first char of first String smaller then the first char of second String
		// returns negative value. (the different will be print)

		String a = "anu";
		String b = "durga";
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(b));

	}

}
