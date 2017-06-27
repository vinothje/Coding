package MyPack;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTest10 {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	  //throw new UnsupportedOperationException("Waiting to be implemented.");
    	Collection str = new ArrayList();
    	
        //Pattern p = Pattern.compile("<folder name=\"(.*?)\"\\s?/?>");
        Pattern p = Pattern.compile("<folder name=\"([0-9a-zA-Z\\s-_]*)\"");
        Matcher m = p.matcher(xml);
        String match_str;
        while(m.find()) {
            match_str = m.group(1);
            if(match_str.charAt(0) == startingLetter) {
            	str.add(match_str);
            }
        }
    	return str;
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall123 information\"/>" +
                    "</folder>" +
                    "<folder name=\"users\"/>" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
   
}