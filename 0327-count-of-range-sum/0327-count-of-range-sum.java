class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long sum = 0;
        List<Long> prefixSums = new ArrayList<>();
        prefixSums.add(0L); // Base case
        int count = 0;

        for (int num : nums) {
            sum += num; // current prefix sum

            long left = sum - upper;
            long right = sum - lower;

            // find first index >= left
            int leftIndex = lowerBound(prefixSums, left);
            // find first index > right
            int rightIndex = upperBound(prefixSums, right);

            count += (rightIndex - leftIndex);

            // insert current prefix sum in sorted order
            int pos = lowerBound(prefixSums, sum);
            prefixSums.add(pos, sum);
        }
        return count;
    }

    // lower bound: first index with value >= target
    private int lowerBound(List<Long> list, long target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    // upper bound: first index with value > target
    private int upperBound(List<Long> list, long target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}