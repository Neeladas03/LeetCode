class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1,high=m*n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(count_less_mid(mid,m,n)<k){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    static int count_less_mid(int mid,int m,int n){
        int count=0;
        for(int i=1;i<=m;i++){
            count+=Math.min(n,mid/i);
        }
        return count;
    }
}