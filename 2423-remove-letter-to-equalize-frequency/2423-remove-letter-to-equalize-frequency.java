class Solution {
    public boolean equalFrequency(String word) {
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]==0)continue;
            freq[i]--;

            if(isAllFreq(freq)){
                return true;
            }

            freq[i]++;
        }
        return false;
    }

    public static boolean isAllFreq(int freq[]){
        int common=0;
        for(int f:freq){
            if(f==0)continue;
            if(common==0)common=f;
            else if(f!=common)return false;
        }
        return true;
    }
}