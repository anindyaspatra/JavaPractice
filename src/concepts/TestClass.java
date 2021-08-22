package concepts;

public class TestClass {
	int id;
	String name;
	int age;
	public TestClass(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	

	public static void main(String[] args) {
		TestClass tc = new TestClass(1, "A", 1);
		TestClass tc1 = new TestClass(2, "B", 2);
		
		
		System.out.println(tc.age);
		System.out.println(tc1.name);
	}

}
