package MyPack;
import java.util.*;

public class MyTest6 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        	int x = in.nextInt();
        	li.add(x);
        }
        boolean bool = true;
        int counter=0;
        while(bool) {
        	int prev = 0;
        	int curr;
        	Iterator i = li.iterator();
        	boolean tmp_bool = false;
        	while(i.hasNext()) {
        		curr = (int) i.next();
        		if(prev == 0) {
        			prev = curr;
        		} else if(curr > prev) {
        			i.remove();
        			tmp_bool = true;
        		} else {
        			prev = curr;
        		}
        		
        	}
        	System.out.println("coming");
            bool=tmp_bool;
            if(!bool) counter++;
        }
        System.out.println(counter);
	}

}
