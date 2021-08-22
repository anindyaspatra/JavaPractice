import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, -5, 15, 8, 5, 10, 6 };

		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();

		int range = max - min + 1;
		int[] count = new int[range];
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 0; i < count.length - 1; i++)
			count[i + 1] = count[i] + count[i + 1];
		
		for (int i = arr.length - 1; i >= 0; i--) {		
			output[--count[arr[i] - min]] = arr[i];
		}
		
		CountingSort.print(output);

	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
//0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
}
