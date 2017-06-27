package Problem1;

public class SingleElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,1,2,2,3,3,4,8,8,9};
		
		
		for(int i=1;i<arr.length-1;i++) {
			if(i==1 && arr[i-1] != arr[i]) {
				System.out.println(arr[i-1]);
				return;
			} else if(arr[i-1] != arr[i] && arr[i] != arr[i+1]) {
				System.out.println(arr[i]);
				return;
			}else if(i== arr.length-2 && arr[i] != arr[i+1]) {
				System.out.println(arr[i+1]);
				return;
			}
		}
	}

}
