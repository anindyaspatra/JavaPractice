
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 15, 8, 3, 10, 6 };
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length - 1);
		qs.print(arr);

	}

	void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	int partitionAscending(int[] arr, int lBound, int rBound) {
		int pivot = arr[lBound];
		int start = lBound;
		int end = rBound;

		while (start < end) {
			while (arr[start] <= pivot) {
				start++;
				if (start > arr.length - 1) {
					break;
				}
			}

			while (arr[end] > pivot) {
				end--;
				if (end < 0) {
					break;
				}
			}

			if (start < end) {
				swap(arr, start, end);
			}
		}

		swap(arr, lBound, end);
		return end;
	}
	
	int partitionDescending(int[] arr,int lBound, int rBound) {
		int pivot = arr[lBound];
		int start = lBound;
		int end = rBound;
		
		while(start<end) {
			while(arr[start]>=pivot) {
				start++;
				if(start>arr.length-1) {
					break;
				}
			}
			while(arr[end]<pivot) {
				end--;
				if(end<0) {
					break;
				}
			}
			if(start<end) {
				swap(arr, start, end);
			}
		}
		
		swap(arr, lBound, end);
		return end;
	}

	void sort(int[] arr, int lBound, int rBound) {
		if (lBound < rBound) {
			int partition = partitionDescending(arr, lBound, rBound);
			sort(arr, lBound, partition - 1);
			sort(arr, partition + 1, rBound);
		}
	}

}
