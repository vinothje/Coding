package Accountpackage;
import java.util.*;

public class Intuit {
	public static void main(String[] arg) {
		String cities = "california,nevada,arizona,utah,california";
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		String[] city = cities.split(",");
		Integer val;
		for(String c: city) {
			if(map.containsKey(c)) {
				val  = map.get(c);
				map.put(c, val+1);
			} else {
				map.put(c, 1);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
