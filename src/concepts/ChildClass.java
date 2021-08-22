package concepts;

public class ChildClass extends ParentClass {
	@Override
	public void print() {
		System.out.println("Child Class Print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc = new ChildClass();
		pc.print();
		
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	int sum (int a, int b, int c) {
		return a+b+c;
	}

	
	/**
	 * 
	 */
}
