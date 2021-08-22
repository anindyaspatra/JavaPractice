package problems;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(retFloat());
		System.out.println(testMethod());
	}

	public static float retFloat() {
		float x = (float) 0.0;
		return x++;
	}

	public static boolean testMethod() {
		int a = 5;
		int b = 6;
		return (a > b) ? true : false;
	}

}
