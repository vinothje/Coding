package MyPack;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PolishNotation {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      

	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	         System.out.println(check(input));
	      }
	}
	
	public static boolean check(String input) {
	      Stack<Character> st = new Stack<Character>();
	      Character last;
	      Map<Character, Character> m = new HashMap<Character, Character>();
	      m.put('(',  ')');
	      m.put('[', ']');
	      m.put('{', '}');
	      
	      for(int i=0;i<input.length();i++) {
	         if(m.containsKey(input.charAt(i))) {
	        	 st.push(input.charAt(i));
	         } else {
	        	 if(st.isEmpty()) {
	        		 return false;
	        	 }
	        	 last= st.peek();
	        	 if(m.get(last).equals(input.charAt(i))) {
	        		 st.pop();
	        	 } else {
	        		 return false;
	        	 }
	         }
	      }
	      if(st.isEmpty()) {
	    	  return true;
	      }
	      return false;
	}
	
}
