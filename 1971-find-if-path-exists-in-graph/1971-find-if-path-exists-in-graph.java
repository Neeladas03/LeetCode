class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

       List<List<Integer>>list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(new ArrayList<>());
       }

       for(int mat[]:edges){
        list.get(mat[0]).add(mat[1]);
        list.get(mat[1]).add(mat[0]);
       }

        boolean visited[]=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        visited[source]=true;
        q.add(source);

        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination)return true;

            for(int neighbour:list.get(node)){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;
                }
            }
        }

        return false;
    }
}