package Problem1;
import java.util.*;

public class Check1 {


static Character firstUniqueChar(String input) {
   if(input == null || input.isEmpty()) return null;
    
    Map<Character, Integer> lmap = new LinkedHashMap<Character, Integer>();
    Character ch;
    for(int i=0;i<input.length();i++) {
        ch = input.charAt(i);
        if(lmap.containsKey(ch)) {
            lmap.put(ch, lmap.get(ch) + 1);
        } else {
            lmap.put(ch, 1);
        }
    }
    
    for(Map.Entry data : lmap.entrySet()) {
        if((Integer)data.getValue() == 1) {
            return (Character)data.getKey();
        }
    }
    return null;
}

public static void main(String[] args) {
    //Character ch = firstUniqueChar("find first non repeated character of a given String");
	Character ch = firstUniqueChar("");
    System.out.println(ch);
}

}
