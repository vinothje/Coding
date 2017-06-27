package MyPack;

import java.util.*;

class MyClass
{
    public static void main(String[] args)
    {
    	HashMap<String, Integer> input = new HashMap<String, Integer>();
    	input.put("A",  10);
    	input.put("B",  10);
    	input.put("C", 15);
    	input.put("D", 20);
    	
    	Set<String> res = findMax(input);
    	System.out.println(res.toString());
    }
 
    static Set<String> findMax(HashMap<String, Integer> input) {
    	Set<String> res = new HashSet<String>();
    	Map<Integer, List<String>> map2 = new HashMap<Integer, List<String>>();
    	
    	List tmp2 = new ArrayList<String>();
    	List<Integer> arr = new ArrayList<Integer>();
    	
    	for(Map.Entry<String, Integer> m : input.entrySet()){
    		List tmp = new ArrayList<>();
    		if(map2.containsKey(m.getValue())) {
    			tmp = map2.get(m.getValue());
    			tmp.add(m.getKey());
    			map2.put(m.getValue(), tmp);
    		} else {
    			tmp.add(m.getKey());
    			map2.put(m.getValue(), tmp);
    		}
    		arr.add(m.getValue());
    	}

    	Collections.sort(arr);
    	System.out.println(map2);
    	System.out.println(arr);
    	for(int i : arr) {
    		tmp2 = map2.get(i);
    		for(Object s : tmp2) {
    			res.add((String)s);
    		}
    	}
    	
    	return res;
    }
}