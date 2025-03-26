class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String>dict=new HashSet<>(wordDict);
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        dp[0]=true;

        for(int i=1;i<=n;i++){
            for(String word:wordDict){
                int len=word.length();
                 if (i >= len && dp[i - len] && s.startsWith(word, i - len)) {
                    dp[i] = true;
                    break; 
                }
            }
        }

        return dp[n];
    }
}