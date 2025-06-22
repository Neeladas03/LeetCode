class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

         Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) dp.add(new ArrayList<>());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> maxSubset = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (dp.get(j).size() > maxSubset.size() ||
                        (dp.get(j).size() == maxSubset.size() &&
                         compareLex(dp.get(j), maxSubset) > 0)) {
                        maxSubset = dp.get(j);
                    }
                }
            }
            dp.get(i).addAll(maxSubset);
            dp.get(i).add(nums[i]);

            if (dp.get(i).size() > result.size() ||
                (dp.get(i).size() == result.size() &&
                 compareLex(dp.get(i), result) > 0)) {
                result = dp.get(i);
            }
        }

        return result;
    }

    private int compareLex(List<Integer> a, List<Integer> b) {
        int n = Math.min(a.size(), b.size());
        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }
        return Integer.compare(a.size(), b.size());
    }
}