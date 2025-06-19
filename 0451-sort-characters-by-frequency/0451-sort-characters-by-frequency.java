class Pair{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>fmap=new HashMap<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq)return b.freq-a.freq;
                return Character.compare(a.ch,b.ch);
            }
        );
        char arr[]=s.toCharArray();
        for(char ch:arr){
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer>entry:fmap.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
             for (int i = 0; i < curr.freq; i++) {
                sb.append(curr.ch);
            }
        }
        return sb.toString();
    }
}