class Solution {
    private int helper(String word){

     int result=0;
     for(int i=0;i<word.length();i++){
        result=result*10+(word.charAt(i)-'a');
     }
     return result;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int first=helper(firstWord);
        int second=helper(secondWord);
        int target=helper(targetWord);

        return first+second==target;
    }
}