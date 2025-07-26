class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int num:nums){
            if(num==0)zero++;
            else if(num==1)one++;
            else two++;
        }

        int n=nums.length;
        int i=0;
        while(i<n){
            if(zero!=0){
                while(zero-->0){
                    nums[i++]=0;
                }
            }

            if(one!=0){
                while(one-->0){
                    nums[i++]=1;
                }
            }

            if(two!=0){
                while(two-->0){
                    nums[i++]=2;
                }
            }
        }

    }
}