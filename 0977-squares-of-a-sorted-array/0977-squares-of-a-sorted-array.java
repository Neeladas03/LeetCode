class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        mergeSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }

        return ans;
    }

    public void mergeSort(int nums[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public void merge(int nums[],int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }

        while(i<=mid)temp[k++]=nums[i++];
        while(j<=high)temp[k++]=nums[j++];

        for(int t=0;t<temp.length;t++){
            nums[low+t]=temp[t];
        }
    }
}