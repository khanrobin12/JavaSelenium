package StringAtoZ;

//Case 2: two approaches to create String with new and without new. 
public class TestClass2 {

	public static void main(String[] args) {
		// There are two way to create String by new operator or without new operator
		// without using new operator it will save in SIPP memory. it will always check
		// the previous object.
		String s1 = "ratan";
		String s2 = "anu";
		String s3 = "ratan";
		System.out.println(s1 == s2);// False
		System.out.println(s1 == s3);// True
		System.out.println(s2 == s3);// False
		// == Operator always use for reference comparison

		// with new operator it will save in Heap memory. it won't check the previous
		// object.
		String s4 = new String("robin");
		String s5 = new String("ali");
		String s6 = new String("robin");
		System.out.println(s4 == s5);// False
		System.out.println(s4 == s6);// False
		System.out.println(s5 == s6);// False

		StringBuffer sb = new StringBuffer("robin");
		StringBuffer sb1 = new StringBuffer("ali");
		StringBuffer sb2 = new StringBuffer("robin");

		System.out.println(sb == sb1);// False
		System.out.println(sb == sb2);// False
		System.out.println(sb1 == sb2);// False

		System.out.println(System.getProperty("user.dir"));
	}

}
