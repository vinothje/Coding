package Problem1;
import java.util.*;

public class LongConsecSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aaaaddddccccccbbbcccbdddadacb";
		System.out.println("strlen:"+str.length());
		Set<Character> hset = new LinkedHashSet<Character>();
		int start = 0;
		int end;
		String res= "";
		String substr = "";
		int prevind=0;
		for(int i=0;i<str.length();i++) {
			System.out.println(hset.size());
			char ch = str.charAt(i);
			if(hset.size() ==1 && !hset.contains(ch)) {
				prevind = i;
			}	
			if(hset.size() == 2 && !hset.contains(ch)) {
				substr =str.substring(start, i); 
				if( substr.length() > res.length()) {
					res = substr;
				}
				start = prevind;
				hset.remove(str.charAt(prevind));
				hset.add(ch);
			} else {
				hset.add(ch);
				
			}
		}
		System.out.println(res);
	}

}
