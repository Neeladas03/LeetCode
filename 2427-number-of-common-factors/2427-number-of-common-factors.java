class Solution {
    public int commonFactors(int a, int b) {
        int range =Math.max(a,b);
        int count=0;

        for(int i=1;i<=range;i++){
            if(a%i==0  && b%i==0)count++;
        }

        return count;

    }
}