package Problem1;

public class LongestSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcbbbcccbdddadacb";
		if(str.length() == 1) {
			System.out.println(str);
			return;
		}
		String res = "";
		char ch;
		String mstr = "";
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if(res.indexOf(ch) > -1) {
				res = res.substring(res.indexOf(ch)+1);
			}
			res = res + ch;	

			if(res.length() > mstr.length()) {
				mstr = res;
			}
		}
		System.out.println(mstr);
	}
}
