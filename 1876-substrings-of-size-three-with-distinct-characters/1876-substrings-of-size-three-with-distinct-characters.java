class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;

        int[] freq = new int[26];
        int distinct = 0, count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (freq[ch - 'a'] == 0) distinct++;
            freq[ch - 'a']++;

            if (right - left + 1 > 3) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                if (freq[leftChar - 'a'] == 0) distinct--;
                left++;
            }

            if (right - left + 1 == 3 && distinct == 3) {
                count++;
            }
        }

        return count;
    }
}
