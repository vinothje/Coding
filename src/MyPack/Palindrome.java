package MyPack;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    	word=word.toLowerCase();
    	System.out.println(Math.round(word.length()/2));
        for(int i=0, j=word.length()-1;i<Math.round(word.length()/2);j--,i++) {
        	char c1 = word.charAt(i);
        	char c2 = word.charAt(j);
        	if(c1 != c2) {
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Madamam"));
    }
}