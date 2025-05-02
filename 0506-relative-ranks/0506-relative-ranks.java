class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>>pq=new PriorityQueue<>((a,b)-> (b.getValue()-a.getValue()));
        int n=score.length;

        for(int i=0;i<n;i++){
            pq.add(new Pair(i,score[i]));
        }

        int place=1;
        String ans[]=new String[n];
        while(!pq.isEmpty()){
            Pair<Integer,Integer>temp=pq.poll();
            int index=temp.getKey();
            if(place==1){
                ans[index]="Gold Medal";
            }
            else if(place==2){
                ans[index]="Silver Medal";
            }
            else if(place==3){
                ans[index]="Bronze Medal";
            }
            else{
                ans[index]=String.valueOf(place);
            }
            place++;
        }

        return ans;
    }
}