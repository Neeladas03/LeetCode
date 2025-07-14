class Solution {
    static Set<String> st;
    static {
        st = new HashSet<>();
        long p = 1; 
        for (int i = 1; i <= 22; i++) {
            st.add(Long.toString(p, 2)); // store binary strings of powers of 5
            p *= 5;
        }
    }

    static int max = (int) 1e9;

    public int helper(String s, int idx) {
        if (idx == s.length()) return 0;

        StringBuilder sb = new StringBuilder();
        int ans = max;

        for (int i = idx; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (st.contains(sb.toString())) {
                int res = helper(s, i + 1);
                if (res != max) {
                    ans = Math.min(ans, 1 + res);
                }
            }
        }

        return ans;
    }

    public int minimumBeautifulSubstrings(String s) {
        int result = helper(s, 0);
        return result == max ? -1 : result;
    }
}
