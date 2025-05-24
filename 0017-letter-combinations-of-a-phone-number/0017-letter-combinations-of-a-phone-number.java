class Solution {
    static Map<Character,String>map=new HashMap<>();
    static{
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits==null||digits.length()==0)return ans;
        helper(digits,0,new StringBuilder(),ans);
        Collections.sort(ans);
        return ans;
    }
    static void helper(String digits,int index,StringBuilder curr,List<String>ans){
        if(curr.length()==digits.length()){
            ans.add(curr.toString());
            return;
        }
        
        String possibleletters=map.get(digits.charAt(index));
        for(char ch:possibleletters.toCharArray()){
            curr.append(ch);
            helper(digits,index+1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}