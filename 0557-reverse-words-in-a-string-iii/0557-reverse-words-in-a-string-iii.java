class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            arr[i]=sb.reverse().toString();
        }
        String ans=String.join(" ",arr);
        return ans;
    }
}