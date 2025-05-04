class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        Map<Character, Integer> pmap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> smap = new HashMap<>();
        int left = 0;
        int k = p.length();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            if (right - left + 1 == k) {
                if (smap.equals(pmap)) {
                    ans.add(left);
                }
                
                char toRemove = s.charAt(left);
                smap.put(toRemove, smap.get(toRemove) - 1);
                if (smap.get(toRemove) == 0) {
                    smap.remove(toRemove);
                }
                left++;
            }
        }

        return ans;
    }
}
