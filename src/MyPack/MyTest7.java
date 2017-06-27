package MyPack;
import java.util.*;

public class MyTest7 {

	public static void main(String[] args) {
		int[][] arr = {{1,3}, {5,10}, {9,31}, {12,30}};
		int j=0;
		int[][] res = new int[arr.length][2];
		int i=0;
		int k=0;
	    while(i < arr.length) {
			j=i+1;
			
			if(arr[j][0] > arr[i][0] && arr[j][0] < arr[i][1]) {
				arr[j][0] = arr[i][0];
				if(arr[j][1] < arr[i][1]) {
					arr[j][1] = arr[i][1];
				}
				i=j;
				if(j == arr.length-1) {
					res[k][0] = arr[j][0];
					res[k][1] = arr[j][1];
					break;
				} else {
					continue;
				}
			} else {
				res[k][0] = arr[i][0];
				res[k][1] = arr[i][1];
		     	i++;
				if(j == arr.length-1) {
					k++;
		    		res[k][0] = arr[i][0];
		    		res[k][1] = arr[i][1];
		    		break;
				}
			}
			k++;

		}
	    for(int x=0;x<res.length;x++) {
	        System.out.println(res[x][0] + ":" + res[x][1]);
	    }
	}

}
