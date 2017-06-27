package Problem1;

public class LetterCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="def";
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				System.out.println(str1.charAt(i) + "" + str2.charAt(j));
			}
		}
	}

}
