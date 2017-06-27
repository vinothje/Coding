package Problem1;
import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		Map<String, List<String>> hmap= new HashMap<String, List<String>>();
		for(String str :input) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String rstr = String.valueOf(ch);
			if(!hmap.containsKey(rstr)) hmap.put(rstr, new ArrayList<String>());
			hmap.get(rstr).add(str);
		}
		//return  new ArrayList<List<String>>(hmap.values());
		for(List<String> li : hmap.values()) {
			System.out.println(Arrays.toString(li.toArray()));
		}
		
	}


}
