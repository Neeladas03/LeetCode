class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair<String,Integer>>pq=new PriorityQueue<>((a,b)->
        b.getValue()-a.getValue());

        for(int i=0;i<names.length;i++){
            pq.add(new Pair(names[i],heights[i]));
        }

        String ans[]=new String[names.length];
        int i=0;
        while(!pq.isEmpty()){
            Pair<String,Integer>temp=pq.poll();
            String name=temp.getKey();
            ans[i++]=name;
        }
        return ans;

    }
}