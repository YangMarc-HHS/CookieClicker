import java.util.Arrays;

public class program {
	static int[] array = {9,1,5,4,6,7,2,8,3};
	
	private static void mergeSort (int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left+right)/2;
		mergeSort(left,mid);
		mergeSort(mid+1,right);
		sort();
		
	}
	
	private static int[] sort () {
		
		
		 int n = array.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (array[j] > array[j + 1]) {

	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	        return array;
	}

	public static void main (String[]args) {

		mergeSort(0,array.length);
		
		
		System.out.println(Arrays.toString(array));
	}
}
