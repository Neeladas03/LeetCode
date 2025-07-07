class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        int low=1,high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            long m_squared=(long)mid*mid;
            if(x==m_squared)return mid;
            else if(m_squared>x)high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}