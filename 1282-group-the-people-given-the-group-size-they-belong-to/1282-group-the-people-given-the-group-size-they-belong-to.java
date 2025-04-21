class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(groupSizes[i],new ArrayList<>());
            map.get(groupSizes[i]).add(i);
        } 

        List<List<Integer>>ans=new ArrayList<>();
        
        for(HashMap.Entry<Integer,List<Integer>>e:map.entrySet()){
            int size=e.getKey();
            int arrsize=e.getValue().size();


            for(int i=0;i<arrsize;i+=size){
                int end=Math.min(arrsize,i+size);
                ans.add(new ArrayList<>(e.getValue().subList(i,end)));
            }
        }
        return ans;

    }
}