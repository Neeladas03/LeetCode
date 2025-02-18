class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int x:asteroids){
            if(x>0){
                st.push(x);
            }
            if(x<0){
                if(!st.isEmpty()){
                int val=Math.abs(x);
                while(st.peek()<=val){
                    st.pop();
                }
                if(st.isEmpty())ans.add(x);
                }
                else{
                    st.push(x);
                }
            }
        }

        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        Collections.sort(ans);

     int[] result = new int[ans.size()];
     for (int i = 0; i < ans.size(); i++) {
       result[i] = ans.get(i);
     }

     return result;
    }
}