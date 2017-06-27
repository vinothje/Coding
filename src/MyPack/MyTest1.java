package MyPack;
import java.io.*;

public class MyTest1 {
	public static void main(String[] args) {
		String s = "x%20x%20abc%20";
		String s1 = "%20";
		String s2 = "c";
		
		//System.out.println(s.replaceAll("%20", "c"));
				//System.out.println(s.substring(2,3));
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		int slen = 0;
		while(slen < s.length()) {
			System.out.println(slen);
			if((slen+s1.length() <= s.length()) &&
			  s.substring(slen, (slen+s1.length())).equals(s1)) {
				sb.append(s2);
				slen +=s1.length()-1;
			} else {
				sb.append(ch[slen]);
			}
			slen++;
		}
		
		System.out.println(sb);
	}

}
