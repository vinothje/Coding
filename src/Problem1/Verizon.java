package Problem1;

void find(String str) {
    
    char[] ch = str.toChar();
    int cnt=1;
    StringBuffer strbuff= new StringBuffer();
    strbuff.append(ch[0]);
    for(int i=1;i<str.length;i++) {
        if(ch[i-1] == ch[i]) {
            cnt++;
            if(cnt <= 3) {
                strbuff.append(ch[i]);
            }
        } else {
            strbuff.append(ch[i]);
            cnt=1;
        }
    }
    System.out.println(strbuff);
}