class Solution {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^A-Za-z0-9]+","").toLowerCase();
       StringBuilder sb=new StringBuilder();
       sb.append(s);
       sb.reverse();

       return sb.toString().equals(s);
    }
}