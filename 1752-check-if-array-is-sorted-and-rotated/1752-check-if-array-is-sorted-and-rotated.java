class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int k=1%n;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);

        int arr[]= new int[n];
        int count=0;
        while(count!=n){
            for(int i=0;i<n;i++){
                arr[(i+k)%n]=nums[i];
            }
            if(Arrays.equals(temp,arr)){
                return true;
            }
            else{
            count++;
            for(int i=0;i<n;i++){
                nums[i]=arr[i];;
            }
            }
        }

        return Arrays.equals(temp,arr);
    }
}