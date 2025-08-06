class Solution {
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }

    public static String helper(String text){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!='#'){
                sb.append(text.charAt(i));
            }
            else{
                if(sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}