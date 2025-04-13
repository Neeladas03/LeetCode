class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        if(n==1)return true;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        int c_count=set.size();

        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }

         int max_count=0;
        for(int i=0;i<26;i++){
            max_count=Math.max(max_count,count[i]);
        }

        if((c_count*max_count)==s.length()){
            return true;
        }
        else{
            return false;
        }

    }
}