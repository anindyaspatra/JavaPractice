package concepts;

public class SingleObject {
	private SingleObject() {
		
	}
	
	private static SingleObject instance = new SingleObject();
	
	public static SingleObject getInstance() {
		return instance;
	}

	void showMessage() {
		System.out.println("Message Displayed");
	}
}
