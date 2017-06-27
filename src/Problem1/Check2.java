package Problem1;
import java.util.*;

public class Check2 {


public static void main(String[] args) {
    String input = "abcbbbbcccbdddadacb";
    String res = longest2CharacterSubstring(input);
    System.out.println(res);
}

static String longest2CharacterSubstring(String input) {
    if(input == null || input.isEmpty()) return null;
    Set<Character> hset = new LinkedHashSet<Character>();
    
    Character ch;
    int secondInd =0;
    int start=0;
    String result = "";
    String substr="";
    for(int i=0; i<input.length();i++) {
        ch = input.charAt(i);
        if(!hset.contains(ch) && hset.size() == 1) {
            secondInd = i;
        }
        if(!hset.contains(ch) && hset.size() == 2) {
            substr = input.substring(start, i);
            if(substr.length() > result.length()) {
                result = substr;
            }
            start = secondInd;
            hset.remove(input.charAt(secondInd));
        }
        hset.add(ch);
    }
    
    return result;
}
	
}
