class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>Disappeared=new ArrayList<>();
        Set<Integer>seen=new HashSet<>();
        for(int num:nums)seen.add(num);

        for(int i=1;i<=n;i++){
            if(!seen.contains(i))Disappeared.add(i);
        }

        return Disappeared;
    }
}