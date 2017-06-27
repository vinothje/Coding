package Problem1;

import java.util.Arrays;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1,-3, 4, -1, 2, 1, -5, 4};
		
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum =0;
			for(int j=i;j<arr.length;j++) {
				sum+= arr[j];
				max= Math.max(sum, max);
			}
		}
		System.out.println(max);
	}

}
