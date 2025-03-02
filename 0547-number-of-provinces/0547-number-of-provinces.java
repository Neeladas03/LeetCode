class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>ds=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            ds.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    ds.get(i).add(j);
                    ds.get(j).add(i);
                }
            }
        }

        boolean seen[]=new boolean[ds.size()+1];
        int count=0;
        for(int i=0;i<ds.size();i++){
            if(!seen[i]){
                count++;
                dfs(i,ds,seen);
            }
        }

        return count;

    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>>ds,boolean seen[]){
        seen[node]=true;
        for(int nh:ds.get(node)){
            if(!seen[nh]){
                dfs(nh,ds,seen);
            }
        }
    }
}