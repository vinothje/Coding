package Problem1;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,3,4};
		int[] count = new int[arr.length];
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			count[i]++;
		}
		permute(arr, count, res, 0);
	}
	
	static void permute(int[] arr, int[] count, int[] res, int level) {
		if(level == res.length) {
			System.out.println(Arrays.toString(res));
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(count[i] == 0) continue;
			res[level] = arr[i];
			count[i]--;
			permute(arr, count, res, level+1);
			count[i]++;
		}
	}

}
