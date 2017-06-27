package Problem1;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		String[] str = s.split("\\s");
		System.out.println(str[str.length-1].length());
	}

}
