class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        boolean seen[]=new boolean[n];
        ArrayList<ArrayList<Integer>>gp=new ArrayList<>();
        for(int i=0;i<n;i++){
            gp.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1){
                    gp.get(i).add(j);
                    gp.get(j).add(i);
                }
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
           if(!seen[i]){
            count++;
            bfs(i,gp,seen);
           }
        }
        return count;
    }

    public void bfs(int node,ArrayList<ArrayList<Integer>>gp,boolean seen[]){
        seen[node]=true;
        for(int nh:gp.get(node)){
            if(!seen[nh]){
                bfs(nh,gp,seen);
            }
        }
    }
}