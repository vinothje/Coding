package MyPack;

import java.util.*;

public class Plates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++) {
        	int x = in.nextInt();
        	st.push(x);
        }
        
        int take = 0;
        int i = st.size();
        Stack<Integer> stb = new Stack<Integer>();
        Stack<Integer> sta = new Stack<Integer>();
        while(!st.isEmpty()) {
        	System.out.println(st.peek() + ":" +i);
        	take = st.pop();
        	if(take % i == 0) {
        		System.out.println("stb:"+take);
        		stb.push(take);
        	} else {
        		System.out.println("sta:"+take);
        		sta.push(take);
        	}
        	i--;
        }
        
        printOff(stb);
        printOff(sta);
	}

	static void printOff(Stack st) {
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
