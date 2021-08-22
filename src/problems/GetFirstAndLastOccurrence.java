package problems;

public class GetFirstAndLastOccurrence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 8, 8, 8, 9, 10, 40, 40, 40, 40 };
		int n = arr.length;
		int x = 40;
		int index = search(arr, x, 0, n);
		int startIndex = index;
		int endIndex = index;
		for (int i = index - 1; i >= 0; i--) {
			if (arr[i] == x) {
				startIndex = i;
			} else
				break;
		}
		for (int i = index + 1; i < n; i++) {
			if (arr[i] == x) {
				endIndex = i;
			} else
				break;
		}
		System.out.println("Start Index: " + startIndex);
		System.out.println("End Index:" + endIndex);

		System.out.println("First Occurrence = " + first(arr, 0, n - 1, x));
		System.out.println("Last Occurrence = " + last(arr, 0, n - 1, x));
	}

	public static int search(int[] arr, int key, int l, int r) {
		if (r >= l) {
			int mid = (l + r) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return search(arr, key, l, mid - 1);
			}
			return search(arr, key, mid + 1, r);
		}
		return -1;
	}

	public static int first(int arr[], int low, int high, int x) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
				return mid;
			else if (x > arr[mid])
				return first(arr, (mid + 1), high, x);
			else
				return first(arr, low, (mid - 1), x);
		}
		return -1;
	}

	/*
	 * if x is present in arr[] then returns the index of LAST occurrence of x in
	 * arr[0..n-1], otherwise returns -1
	 */
	public static int last(int arr[], int low, int high, int x) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x)
				return mid;
			else if (x < arr[mid])
				return last(arr, low, (mid - 1), x);
			else
				return last(arr, (mid + 1), high, x);
		}
		return -1;
	}

}
