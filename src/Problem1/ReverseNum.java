package Problem1;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 9646324;
		if(num > Integer.MAX_VALUE) {
			return 0;
		}
		String str = "";
		if(num < 0) {
			str = "-";
			num = Math.abs(num);
		}
		long res;
		while(num > 0) {
			res = (num %10);
			str = str + res;
			num = num / 10;
		}
		Integer.parseInt(str);
		System.out.println(str);
	}

}
