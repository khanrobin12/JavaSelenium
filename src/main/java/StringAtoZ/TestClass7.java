package StringAtoZ;

//Case 9: StringBuffer methods 
public class TestClass7 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("alinoor");
		System.out.println(sb.delete(2, 4));
		System.out.println(sb.deleteCharAt(3));

		StringBuffer sb1 = new StringBuffer("durgasoft");
		System.out.println(sb1.reverse());

		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb2.append("soft"));

		StringBuffer sb3 = new StringBuffer("khanro");
		System.out.println(sb3.insert(6, "bin"));

		StringBuffer sb4 = new StringBuffer("khanro");
		System.out.println(sb4.replace(4, 6, ""));

	}

}
