class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
     List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        helper(1,ans,ds,n,k);
        return ans;
    }

    public void helper(int index,List<List<Integer>>ans,List<Integer>ds,int t,int k){
        if(t==0 && ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i=index;i<=9;i++){
            if(i>t)break;

            ds.add(i);
            helper(i+1,ans,ds,t-i,k);
            ds.remove(ds.size()-1);
        }

    }
}