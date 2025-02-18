class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int i:nums2){
            while(!st.isEmpty()&&st.peek()<i){
                map.put(st.pop(),i);
            }
                st.push(i);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}