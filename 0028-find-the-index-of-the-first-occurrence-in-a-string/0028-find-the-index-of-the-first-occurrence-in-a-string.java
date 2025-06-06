class Solution {
    public int strStr(String haystack, String needle) {
        
        int d=256;
        int p=101;
        int h=1;
        int m=haystack.length(),n=needle.length();
        if(n>m)return -1;
        for(int i=0;i<n-1;i++){
            h=(h*d)%p;
        }

        int nhash=0;
        int whash=0;
        for(int i=0;i<n;i++){
            nhash=(d*nhash+needle.charAt(i))%p;
            whash=(d*whash+haystack.charAt(i))%p;
        }

        for(int i=0;i<=m-n;i++){
            if(nhash==whash){
                boolean match=true;
                for(int j=0;j<n;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        match=false;
                        break;
                    }
                }
                if(match)return i;
            }

            if(i<m-n){
                whash=(d*(whash-haystack.charAt(i)*h)+(haystack.charAt(i+n)))%p;
                if(whash<0)whash+=p;
            }
        }
        return -1;
    }
}