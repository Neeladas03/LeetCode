class Pair{
    int u; int w;
    Pair(int u, int w)
    {
        this.u=u;
        this.w=w;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
      ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
      int[] dis=new int[n+1];
      PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)-> x.w -y.w);
      Arrays.fill(dis, Integer.MAX_VALUE);
      pq.add(new Pair(k,0));
      dis[k]=0;
      for(int i=0;i<=n;i++)
      {
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<times.length;i++)
      {
        adj.get(times[i][0]).add(new Pair(times[i][1], times[i][2]));
      }
      while(!pq.isEmpty())
      {
        int node=pq.peek().u;
        int wt=pq.peek().w;
        pq.poll();
        for(int i=0;i<adj.get(node).size();i++)
        {
            int v=adj.get(node).get(i).u;
             int ww=adj.get(node).get(i).w;
             if(dis[v]>wt+ww)
             {
                dis[v]=wt+ww;
                pq.add(new Pair(v, dis[v]));
             }
        }
      }
      int max=0;
for(int i=1;i<=n;i++) {
    if(dis[i]==Integer.MAX_VALUE) return -1;
    max=Math.max(max, dis[i]);

}
// return Arrays.stream(dis).max().getAsInt();
return max;
    }
}