package designPatternSingleton;

public class Singleton {
	private Singleton() {	
	}
	
	private ClassA instanceA;
	private ClassB instanceB;
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public ClassA instanceA() {
		if(instanceA == null) {
			instanceA = new ClassA();
		}
		return instanceA;
	}
	
	public ClassB instanceB() {
		if(instanceB == null) {
			instanceB = new ClassB();
		}
		return instanceB;
	}
	

}
