package StringAtoZ;

// Case 5: toString(). 
// if we are not overriding toString(): then execute object class toStirng()  and generate hashCode. 
//if we are overriding toSting() : then our class toString() execute. 
public class TestClass4 {

	int eid;
	String name;
	int age;
	String prof;

	public TestClass4(int eid, String name, int age, String prof) {
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.prof = prof;
	}

	@Override
	public String toString() {
		return eid + name + age + prof;
	}

	public static void main(String[] args) {
		TestClass4 t = new TestClass4(1, "ali", 22, "student");
		System.out.println(t);
		System.out.println(t.toString());

	}

}
