class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[m+n];
        int ptr1=0,ptr2=0,i=0;

        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<=nums2[ptr2]){
                temp[i++]=nums1[ptr1++];
            }
            else{
                temp[i++]=nums2[ptr2++];
            }
        }

        while(ptr1<m)temp[i++]=nums1[ptr1++];
        while(ptr2<n)temp[i++]=nums2[ptr2++];

        for(int j=0;j<m+n;j++){
           nums1[j]=temp[j];
        }
    }
}