class Node{
    int value;
    int row;
    int col;
    Node(int value,int row,int col){
        this.value=value;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int n=nums.size();
        int max=Integer.MIN_VALUE;
        int start=0,end=Integer.MAX_VALUE;

        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->a.value-b.value);
        for(int i=0;i<n;i++){
            pq.add(new Node(nums.get(i).get(0),i,0));
            max=Math.max(max,nums.get(i).get(0));
        }

        while(true){
            Node curr=pq.poll();
            int min=curr.value;
            if(max-min<end-start){
                start=min;
                end=max;
            }

            if(curr.col+1<nums.get(curr.row).size()){
                int nextval=nums.get(curr.row).get(curr.col+1);
                pq.add(new Node(nextval,curr.row,curr.col+1));
                max=Math.max(max,nextval);
            }
            else{
                break;
            }
        }

         int ans[]=new int[2];
         ans[0]=start;
         ans[1]=end;
         return ans;
    }
}