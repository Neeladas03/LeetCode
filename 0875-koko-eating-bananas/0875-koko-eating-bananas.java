class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int slow=1,high=0;
        for(int num:piles){
            high=Math.max(high,num);
        }
        int ans=high;
        while(slow<=high){
            int mid=slow+(high-slow)/2;
            if(canEat(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                slow=mid+1;
            }
        }
        return ans;

    }

    public boolean canEat(int piles[],int h,int s){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+(long)s-1)/s;
        }
        return hours<=h;
    }
}