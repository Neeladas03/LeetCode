class Solution {
    public boolean isPossibleDivide(int[] arr, int k) {
        if (arr.length % k != 0) return false;

        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        while (!freq.isEmpty()) {
            int start = freq.firstKey();

            for (int i = 0; i < k; i++) {
                int current = start + i;
                if (!freq.containsKey(current)) return false;

                freq.put(current, freq.get(current) - 1);
                if (freq.get(current) == 0) {
                    freq.remove(current);
                }
            }
        }

        return true;
    }
}