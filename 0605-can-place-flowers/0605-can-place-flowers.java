class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // Check if the previous and next flowerbeds are empty or if it's an edge case
                boolean leftEmpty = (i == 0 || nums[i - 1] == 0);
                boolean rightEmpty = (i == nums.length - 1 || nums[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    nums[i] = 1;  // Plant a flower
                    count++;
                    
                    if (count >= n) {
                        return true;  // Early exit if we've planted enough flowers
                    }
                }
            }
        }
        
        return count >= n;
    }
}
