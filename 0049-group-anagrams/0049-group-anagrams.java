class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            int count[]=new int[26];
            for(char c:s.toCharArray()){
               count[c-'a']++;
            }

            String word=Arrays.toString(count);
            map.putIfAbsent(word,new ArrayList<>());
            map.get(word).add(s);
        }

        return new ArrayList<>(map.values());
    }
}