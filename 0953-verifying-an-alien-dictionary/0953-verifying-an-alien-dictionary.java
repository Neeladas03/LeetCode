class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int rank[]=new int[26];
        for(int i=0;i<26;i++){
            rank[order.charAt(i)-'a']=i;
        }


         
        for(int i=0;i<words.length-1;i++){
            String s1=words[i];
            String s2=words[i+1];

            int len=Math.min(s1.length(),s2.length());
            boolean valid=false;

            for(int j=0;j<len;j++){
                char c1=s1.charAt(j);
                char c2=s2.charAt(j);
                 
                if(rank[c1-'a']<rank[c2-'a']){
                    valid=true;
                    break;
                }

                if(rank[c1-'a']>rank[c2-'a']){
                    return false;
                }
            }
            if(!valid && s1.length()>s2.length())return false;
        }
        return true;
    }
}