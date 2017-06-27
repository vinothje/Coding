package Problem1;

import java.util.Arrays;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,2,3,4,5,6,6,6,9};
		int j=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(arr));
	}
}
