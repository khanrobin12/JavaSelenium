package learnJava;

public class TimeComplexity {

	public static void main(String[] args) {

		// to check the performance of the code and logic
		int i = 1;
		System.out.println(i);

		String name = "Tom";
		System.out.println(name);
		// constant time: Big 0(1)

		int n = 10;
		for (int j = 0; j < n; j++) {
			System.out.println(j);
		}

		// 1+n+n+n =3n+1 ---> linear equation
		// 3n+1-->3n --> Big O(n)

	}

}
