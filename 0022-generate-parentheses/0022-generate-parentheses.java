class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        helper(0,0,"",n,res);
        return res;
    }

    public void helper(int openp,int closep,String s,int n,List<String>res){
        if(openp==closep && openp+closep==n*2){
            res.add(s);
            return;
        }

        if(openp<n){
            helper(openp+1,closep,s+"(",n,res);
        }
        if(closep<openp){
            helper(openp,closep+1,s+")",n,res);
        }
    }
}