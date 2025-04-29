class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int nums[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low,j=mid+1,k=0;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=high)temp[k++]=arr[j++];

        for(int t=0;t<temp.length;t++){
            arr[low+t]=temp[t];
        }
    }
}