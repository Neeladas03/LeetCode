class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int h=Integer.MAX_VALUE;
        int w=0;
        int maxarea=0;
        for(int i=0;i<n;i++){
             h=Math.min(height[left],height[right]);
             w=right-left;
             maxarea=Math.max(maxarea,h*w);
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return maxarea;
    }
}