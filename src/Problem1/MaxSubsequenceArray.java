package Problem1;

public class MaxSubsequenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1,-3, 4, -1, 2, 1, -5, 4};
	    int maxEnd = 0;
	    int maxSofar = 0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	if(maxEnd + arr[i] > maxEnd) {
	    		maxEnd = maxEnd + arr[i];
	    	}
	    	maxSofar = Math.max(maxSofar,  maxEnd);
	    }
	    System.out.println(maxSofar);
	}

}
