class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res=0;
        int n=arr.length;
        int low=0,high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1]){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return res;
    }
}