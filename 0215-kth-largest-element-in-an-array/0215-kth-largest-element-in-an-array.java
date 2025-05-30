class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b) -> b-a);
        for(int num:nums){
            pq.add(num);
        }
        k--;
        while(k-->0){
            pq.poll();
        }
        return pq.poll();
    }
}