class Solution {
    public String addStrings(String num1, String num2) {
       int n1=num1.length();
       int n2=num2.length();

       long val1=0;
       long val2=0;

       for(int i=0;i<n1;i++){
         val1=val1*10+(num1.charAt(i)-48);
       }

       for(int i=0;i<n2;i++){
          val2=val2*10+(num2.charAt(i)-48);
       }

       long ans=val1+val2;
       String res=Long.toString(ans);
       return res;
    }
}