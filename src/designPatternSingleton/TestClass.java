package designPatternSingleton;

public class TestClass {


	static ClassA classA = Singleton.getInstance().instanceA();
	static ClassB classB = Singleton.getInstance().instanceB();
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.calls();
	}

	public void calls() {
		classA.showMessageClassA();
		classB.showMessageClassB();
	}
}
