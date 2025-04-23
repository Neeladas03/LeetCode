class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int maxsize=1;
        
    for (int i = 1; i <= n; i++) {
    int num = i;
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num = num / 10;
    }

    map.putIfAbsent(sum, new ArrayList<>());
    map.get(sum).add(i);
    maxsize = Math.max(maxsize, map.get(sum).size());
}



         int count = 0;
        for (List<Integer> group : map.values()) {
         if (group.size() == maxsize) {
        count++;
        } 
           }


        return count;
    }
}