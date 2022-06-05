package merge_sort;

public class MergeSortBasic {

	public static void main(String[] args) {
		int[] arr = {3,9,3,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);

	}
	
	public static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length]; //making additional array to store sorted value
		mergeSort(arr, tmp, 0, arr.length-1); //start sorting
		
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, tmp, start, mid); //divided 1
			mergeSort(arr, tmp, mid + 1, end); //divided 2
			merge(arr, tmp, start, mid, end); //combine two sorted array
		}
		
	}

	//two sorted arrays are sorted by merge function according to value
	//arr: store repeated about sorted value => pointer of array
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		
		//store sorted values in the tmp array whatever I need
		for(int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		
		int part1 = start;
		int part2 = mid + 1;
		int index = start; //to store sorted value in the arr array
		
		//all loop to sort the value between two sorted array
		while (part1 <= mid && part2 <= end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		
		//after all sorting, if remain a value in the any array
		//mid(배열의 끝) - part1(앞쪽 포인터): 앞쪽 포인터가 배열의 끝에서 남을 만큼을 돌면서 최종적으로 저장할 배열에 남은 값들을 붙여주면 된다. 
		//앞쪽 데이터에 숫자가 남았을 때
		//뒤쪽에 데이터가 남으면 이미 정려된 값이 있는 거기 때문에 그대로 두어도 된다. 앞쪽 데이터가 남는 거에 신경쓰면 된다.
		for (int i = 0; i <= mid - part1; i ++) {
			arr[index + i ] = tmp[part1 + i];
		}
		
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

}
