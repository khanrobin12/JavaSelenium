package StringManipulation2;

//Create a word encoding program which moves each letter by 2, e.g a becomes c, b become d. 
public class Question98 {

	public static void main(String[] args) {

		String sc = "robzity";
		String ec = "";

		for (int i = 0; i < sc.length(); i++) {
			char ch = sc.charAt(i);
			if (ch == 'y' || ch == 'z') {
				ch -= 26;
			}
			ch += 2;
			ec = ec + ch;
		}
		System.out.println(ec);
	}

}
