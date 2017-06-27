package Problem1;

public class LongComPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"c", "c"};
		
		if(str.length == 0) return ;
		int max=Integer.MAX_VALUE;
		for(String s:str) {
			max=Integer.min(s.length(), max);
		}
		System.out.println("max:"+max);
		int strlen1 = str.length;
		int strlen2 = max;
		String sub1;
		int j=1;
		int flag = 0;
		while(j<=strlen2){
			String prev = str[0].substring(0, j);
			for(int i=1;i<strlen1;i++) {
				sub1 = str[i].substring(0, j);
				if(!sub1.equals(prev)) {
					flag = 1;
					break;
				}
				prev = sub1;
			}
			if(flag == 1) {
				break;
			}
			j++;
		}
		
		System.out.println(str[0].substring(0, j-1));
	}

}
