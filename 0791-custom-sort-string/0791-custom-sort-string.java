class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer>fmap=new HashMap<>();
        char arr[]=s.toCharArray();
        for(char ch:arr){
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }

        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            if(fmap.containsKey(ch)){
                int freq=fmap.get(ch);
                for(int i=0;i<freq;i++){
                    sb.append(ch);
                }
                fmap.remove(ch);
            }
        }

        for(char ch:fmap.keySet()){
            int freq=fmap.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}