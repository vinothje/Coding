package Problem1;

import java.util.Arrays;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,3,4};
		int[] count = new int[arr.length];
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			count[i]++;
		}
		permute(arr, count, res, 0, 0);
	}
	
	static void permute(int[] arr, int[] count, int[] res, int curr, int level) {
	    System.out.println(Arrays.toString(Arrays.copyOf(res, level)));
		
		for(int i=curr;i<arr.length;i++) {
			if(count[i] == 0) continue;
			res[level] = arr[i];
			count[i]--;
			permute(arr, count, res, i, level+1);
			count[i]++;
		}
	}
}
