package leetcodeString;

public class backSpaceStringCompare {
    public boolean backSpaceString(String s, String t){
        String S = compare(s);
        String T = compare(t);

        return S.equals(T);
    }
    public String compare(String s){
        StringBuilder sb = new StringBuilder();

        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                count++;
            }else if(count != 0){
                count--;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
