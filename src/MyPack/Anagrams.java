package MyPack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

    public static void main(String[] args) {
          
    	Scanner sc=new Scanner(System.in);
    	String s1 =sc.next();
    	String s2 = sc.next();
    	/* Enter your code here. Print output to STDOUT.*/ 

        if(s1.length() != s2.length()) {
        	System.out.println("Not Anagrams");
        	return;
        }
    	if(isAnagram(s1,s2)) {
    		System.out.println("Anagrams");
    	} else {
    		System.out.println("Not Anagrams");
    	}
    }
    
    static boolean isAnagram(String a, String b) {
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	int[] arr = new int[1000];
    	List li = new ArrayList();
    	for(int i=0;i<a.length();i++) {
    		if(li.contains(a.charAt(i))) {
    			arr[a.charAt(i)]++;
    		} else {
    			arr[a.charAt(i)] = 1;
    			li.add(a.charAt(i));
    		}
    	}
    	
    	for(int i=0;i<b.length();i++) {
    		if(--arr[b.charAt(i)] < 0 ) {
    			return false;
    		}
    	}
    	return true;
    }
}