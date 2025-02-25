class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[]= new int[nums.length];
        Arrays.fill(result,-1);
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            int num=nums[i%nums.length];
            while(!st.isEmpty()&& num>st.peek()[0]){
                 int pair[]=st.pop();
                 result[pair[1]]=num;
            }
            if(i<nums.length)st.push(new int[]{num,i});
        }

        return result;
    }
}