class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return helper(arr,k)-helper(arr,k-1);
    }
    public static int helper(int arr[],int k){
        int res=0,left=0,right=0;
        int n=arr.length;
        Map<Integer,Integer>fmap=new HashMap<>();
        while(right<n){
            fmap.put(arr[right],fmap.getOrDefault(arr[right],0)+1);
            if(fmap.get(arr[right])==1)k--;
            while(k<0){
                fmap.put(arr[left],fmap.get(arr[left])-1);
                if(fmap.get(arr[left])==0)
                k++;
                left++;
            }
            res+=(right-left+1);
            right++;
        }
        return res;
    }
}