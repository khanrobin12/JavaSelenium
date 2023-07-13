package learnJava;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		// ++ and --
		// post increment (the value will increase later)
		// final variable is constant variable.
		// static block will run before main method.

		int a = 1;
		int b = a++;
		int c = 1;

		System.out.println(c++);// 1
		System.out.println(c);// 2
		System.out.println(a);// 2
		System.out.println(b);// 1

		int l = -3;
		int m = l++;
		System.out.println(l);// -2
		System.out.println(m);// -3

		// pre increment

		int u = 1;
		int y = ++u;
		int z = 3;

		System.out.println(++z);// 4
		System.out.println(z);
		System.out.println(u);// 2
		System.out.println(y);// 2

		final int DAYS = 7;
		System.out.println(DAYS);

	}

}
