class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adjlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            adjlist.get(edge[0]).add(edge[1]);
            adjlist.get(edge[1]).add(edge[0]);
        }

        boolean seen[]=new boolean[n];
        return dfs(adjlist,source,destination,seen);
    }

    public boolean dfs(List<List<Integer>>adjlist,int source,int destination,boolean seen[]){
        if(source==destination)return true;
        seen[source]=true;
        for(int nh:adjlist.get(source)){
            if(!seen[nh]){
                if(dfs(adjlist,nh,destination,seen))return true;
            }
        }
        return false;
    }
}