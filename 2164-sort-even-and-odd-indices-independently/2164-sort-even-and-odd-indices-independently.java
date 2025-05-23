class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);

        int evenidx=0,oddidx=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                nums[i]=odd.get(oddidx++);
            }
            else{
                nums[i]=even.get(evenidx++);
            }
        }
        return nums;
    }
}