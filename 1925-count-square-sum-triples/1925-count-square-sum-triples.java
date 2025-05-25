class Solution {
    public int countTriples(int n) {
        boolean seen[]=new boolean[n+1];
        for(int i=1;i<n+1;i++){
            seen[i]=true;
        }
        int count=0;
        for(int a=1;a<n+1;a++){
            for(int b=1;b<n+1;b++){
                int c=(int)Math.sqrt(a*a+b*b);
                if((c*c)!=(a*a+b*b) || c>n)continue;
                if(seen[c])count++;
            }
        }
        return count;
    }
}