package MyPack;
import java.util.*;

public class MyTest11 {
    private String path;

    public MyTest11(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public MyTest11 cd(String newPath) {
    	String[] folders = path.split("/");
    	String[] cd_folders= newPath.split("/");

    	Stack<String> stack = new Stack<String>();
    	for(String tmp:folders) {
    		if(tmp.isEmpty()) {
    			continue;
    		}
    		stack.push(tmp);
    	}
    	
        for(String cdf : cd_folders) {
        	if(cdf.equals("..")) {
        		stack.pop();
        	} else {
        		stack.push(cdf);
        	}
        }
        
        String[] res= stack.toArray(new String[0]);
        
        String result = String.join("/",  res);
    	return new MyTest11(result);
    }

    public static void main(String[] args) {
        MyTest11 path = new MyTest11("/a/b/c/d");
        System.out.println(path.cd("../../../x/y/z").getPath());
    }
}