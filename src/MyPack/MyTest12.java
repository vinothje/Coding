package MyPack;

import java.util.*;

public class MyTest12 {
    private String path;

    public MyTest12(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public MyTest12 cd(String newPath) {
    	String[] cd_folders= newPath.split("/");
    	
    	for(String cdf : cd_folders) {
    		if(cdf.equals("..")) {
    			if(path.isEmpty()) {
    				path="";break;
    			}
    			path = path.replaceFirst("/[a-zA-Z_-]*$", "");
    		} else {
    			path = path + "/"+cdf;
    		}
    	}

    	return new MyTest12(path);
    }

    public static void main(String[] args) {
        MyTest12 path = new MyTest12("/a/b/d/f/g/h");
        System.out.println(path.cd("../../../x/y/z").getPath());
    }
}