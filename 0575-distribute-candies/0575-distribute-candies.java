class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:candyType){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        
        int candy_type=set.size();
        int n=candyType.length;
        int candy_eat=(n/2);

        if(candy_eat>candy_type){
            return candy_type;
        }

        return candy_eat;




    }
}