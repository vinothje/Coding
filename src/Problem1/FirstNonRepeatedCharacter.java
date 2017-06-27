package Problem1;
import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghabfghaabbcddem";
		Map<Character, Integer> lmap= new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(lmap.containsKey(ch)) {
				lmap.put(ch, lmap.get(ch)+1);
			} else {
				lmap.put(ch, 1);
			}
		} 
		for(Map.Entry entry : lmap.entrySet()) {
			if((Integer)entry.getValue() == 1) {
				System.out.println("result: " + entry.getKey());
				break;
			}
		}
	}

}
