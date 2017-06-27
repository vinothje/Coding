package MyPack;
import java.util.*;

public class MyTest4 implements Comparable {
	int id;
	String name;
	
    public MyTest4(int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    @Override
    public int compareTo(Object o) {
    	MyTest4 m = (MyTest4)o;
    	Integer nid = new Integer(this.id);
    	//return this.name.compareTo(m.name);
    	return nid.compareTo((Integer)m.id);
    }
	
	public static void main(String[] args) {
		
		List<MyTest4> li = new ArrayList<MyTest4>();
		li.add(new MyTest4(10,"vinoth"));
		li.add(new MyTest4(20, "john"));
		li.add(new MyTest4(15, "bob"));
		li.add(new MyTest4(30, "mick"));
		
		Collections.sort(li);
		System.out.println(li);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
