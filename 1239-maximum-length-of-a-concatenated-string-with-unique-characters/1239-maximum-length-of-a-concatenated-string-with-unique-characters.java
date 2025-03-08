class Solution {
    public int maxLength(List<String> arr) {
        return helper(arr,0,"");
    }

    public int helper(List<String>arr,int index,String current){
        if(index==arr.size())return current.length();

        int maxlength=helper(arr,index+1,current);

        if(isValid(current,arr.get(index))){
            maxlength=Math.max(maxlength,helper(arr,index+1,current+arr.get(index)));
        }

        return maxlength;
    }

    public boolean isValid(String current,String next){
        Set<Character>seen=new HashSet<>();
        for(char c:next.toCharArray()){
            if(seen.contains(c))return false;
            seen.add(c);
        }

        for(char c:next.toCharArray()){
            if(current.contains(Character.toString(c)))return false;
        }

        return true;
    }
}