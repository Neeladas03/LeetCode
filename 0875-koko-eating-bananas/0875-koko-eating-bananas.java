class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int slow=1,high=0;
        for(int num:piles){
            high=Math.max(high,num);
        }
        int ans=0;
        while(slow<=high){
            int mid=slow+(high-slow)/2;
            if(canEat(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                slow=mid+1;
            }
        }
        return ans;
    }

    public static boolean canEat(int piles[],int speed,int h){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+(long)speed-1)/speed;
        }
        return hours<=h;
    }
}