class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer>counts=new HashMap<>();
        for(String word:words){
            for(char ch:word.toCharArray()){
                counts.put(ch,counts.getOrDefault(ch,0)+1);
            }
        }

        int n=words.length;
        for(Map.Entry<Character,Integer>entry:counts.entrySet()){
            if(entry.getValue()%n!=0){
                return false;
            }
        }

        return true;
     
        
        }
}