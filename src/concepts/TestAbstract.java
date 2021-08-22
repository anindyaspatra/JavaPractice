package concepts;

public abstract class TestAbstract  implements Vehicle {
	public abstract void testAbstractMethod();
	
	public void testConcreteMethod() {
		System.out.println("Test Method");
	}
}
