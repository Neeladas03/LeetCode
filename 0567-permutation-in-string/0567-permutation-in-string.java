class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        HashMap<Character,Integer>s1count=new HashMap<>();
        HashMap<Character,Integer>s2count=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            s1count.put(s1.charAt(i),s1count.getOrDefault(s1.charAt(i),0)+1);
            s2count.put(s2.charAt(i),s2count.getOrDefault(s2.charAt(i),0)+1);
        }
        if(s1count.equals(s2count))return true;
        int left=0;
        for(int right=s1.length();right<s2.length();right++){
            char chright=s2.charAt(right);
            s2count.put(chright,s2count.getOrDefault(chright,0)+1);

            char chleft=s2.charAt(left);
            s2count.put(chleft,s2count.get(chleft)-1);
            if(s2count.get(chleft)==0){
            s2count.remove(chleft);
            }
            left++;    
            if(s1count.equals(s2count))return true;
        }

        return false;
    }
}