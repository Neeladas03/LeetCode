class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<int[]>s1=new Stack<>();
        Stack<int[]>s2=new Stack<>();
        long mod =1000000007L;

        for(int i=0;i<n;i++){
            int count=1;
            while(!s1.isEmpty()&&s1.peek()[0]>arr[i]){
                count+=s1.pop()[1];
            }
            s1.push(new int[]{arr[i],count});
            left[i]=count;
        }

        for(int i=n-1;i>=0;i--){
            int count=1;
            while(!s2.isEmpty()&&s2.peek()[0]>=arr[i]){
                count+=s2.pop()[1];
            }
            s2.push(new int[]{arr[i],count});
            right[i]=count;
        }

        long res = 0;
        for (int i = 0; i < n; i++) {
            res = (res + ((long) arr[i] * left[i] * right[i]) % mod) % mod;
        }
        return (int) res;

    }
}