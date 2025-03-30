class Solution {
    public List<Integer> partitionLabels(String s) {
        int lastocurrence[]=new int[26];
        for(int i=0;i<s.length();i++){
            lastocurrence[s.charAt(i)-'a']=i;
        }
        ArrayList<Integer>result=new ArrayList<>();
        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){
            end=Math.max(end,lastocurrence[s.charAt(i)-'a']);
            if(i==end){
                result.add(end-start +1);
                start=i+1;
            }
        }
        return result;
    }
}