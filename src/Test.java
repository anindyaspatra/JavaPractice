class Test {
	private String str1;

	public void method() {
		this.str1 = "New";
		System.out.println(str1);
	}

	public static void main(String[] args) {
		Test t = new Test();
		// t.method();
		int[] inputArray = { 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0 };
		sortBinaryArray(inputArray, inputArray.length);

		for (int i = 0; i < inputArray.length; i++)
			System.out.print(inputArray[i] + " ");
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(float a, float b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

//	public void sort(int[] inputArray) {
//		int j = -1;
//		for (int i = 0; i < inputArray.length; i++) {
//			if(inputArray[i]<1) {
//				j++;
//				int temp = inputArray[i];
//				inputArray[j] = inputArray[i];
//				inputArray[i] = temp;
//			}
//		}
//		
//		for (int i = 0; i < inputArray.length; i++) {
//			System.out.print(inputArray[i]+", ");
//		}
//	}

	static void sortBinaryArray(int a[], int n) {
		// {1,1,0,1,0,0,1,0,1,0,1,1}
		int j = 0;
		for (int i = 0; i < n; i++) {

			// if number is smaller than 1
			// then swap it with j-th number
			if (a[i] < 1) {
				
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			}
		}
	}
}