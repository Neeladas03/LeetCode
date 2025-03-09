class Solution {
    public boolean makeEqual(String[] words) {
        int count[]=new int[26];
        for(String word:words){
            for(char ch:word.toCharArray()){
                count[ch-'a']++;
            }
        }

        int n=words.length;
        for(int i=0;i<26;i++){
            if(count[i]>0){
                if(count[i]%n!=0){
                    return false;
                }
            }
        }

        return true;
    }
}