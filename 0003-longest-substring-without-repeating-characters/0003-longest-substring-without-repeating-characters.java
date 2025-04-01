class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0)return 0;

        int p1=0;
        int p2=0;
        
        HashSet<Character>seen=new HashSet<>(); 
        int maxLen=Integer.MIN_VALUE;

        while(p2<n){
            if(!seen.contains(s.charAt(p2))){
                seen.add(s.charAt(p2));
                maxLen=Math.max(maxLen,p2-p1+1);
                p2++;
            }
            else{
                seen.remove(s.charAt(p1));
                p1++;
            }
        }
        return maxLen;
    }
}