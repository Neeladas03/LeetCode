class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>seen=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            seen.add(num);
        }

        if(max<0)return 1;
        for(int i=1;i<=max;i++){
            if(!seen.contains(i))return i;
        }
        return max+1;
    }
}