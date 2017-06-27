package MyPack;

class TextInput {
	StringBuffer st = new StringBuffer();
    public void add(Character c) {
    	if(Character.isDigit(c) == false) {
    		st.append(c);
    	}
    }
    
    public String getValue() {
    	return st.toString();
    }
}

class NumericInput extends TextInput {
	StringBuffer st = new StringBuffer();
    public void add(Character c) {
    	if(Character.isDigit(c) == true) {
    		st.append(c);
    	}
    }
    
    public String getValue() {
    	return st.toString();
    }
}

public class UserInput extends NumericInput{
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}