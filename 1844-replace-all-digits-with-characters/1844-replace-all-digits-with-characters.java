class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        int left=0,right=1;
        while(right<n){
            char c=shift(arr,left,right);
            arr[right]=c;
            left+=2;
            right+=2;
        }
        String ans=new String(arr);
        return ans;

    }
    public char shift(char arr[],int left,int right){
        char ch=arr[left];
        int n=arr[right]-'0';
        ch=(char)(ch+n);
        return ch;
    }
}