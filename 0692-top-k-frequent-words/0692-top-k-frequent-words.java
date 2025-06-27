class Pair{
    String word;
    int freq;
    Pair(String word,int freq){
        this.word=word;
        this.freq=freq;
    }

}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.freq!=b.freq)return Integer.compare(a.freq,b.freq);
            else return b.word.compareTo(a.word);
        });
        HashMap<String,Integer>fmap=new HashMap<>();
        for(String s:words){
            fmap.put(s,fmap.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer>entry:fmap.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
            if(pq.size()>k)pq.poll();
        }

        List<String>res=new ArrayList<>();
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            res.add(curr.word);
        }
        Collections.reverse(res);
        return res;

    }
}