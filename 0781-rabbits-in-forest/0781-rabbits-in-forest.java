class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:answers)map.put(num,map.getOrDefault(num,0)+1);

        int tot=0;
        for(HashMap.Entry<Integer,Integer>e:map.entrySet()){
            tot+=Math.ceil((double)e.getValue() / (e.getKey()+1)) * (e.getKey()+1);
        }

        return tot;
    }
}