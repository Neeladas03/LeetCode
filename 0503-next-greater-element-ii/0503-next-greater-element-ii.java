class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int nge[]=new int[nums.length];

        for(int i=2*nums.length-1; i>=0 ;i--){
            while(st.isEmpty()==false && st.peek()<=nums[i%nums.length]){
                st.pop();
            }

            if(i<nums.length){
                if(st.isEmpty()==false)nge[i]=st.peek();
                else nge[i]=-1;
            }
          
           st.push(nums[i%nums.length]);
        }

        return nge;
    }
}