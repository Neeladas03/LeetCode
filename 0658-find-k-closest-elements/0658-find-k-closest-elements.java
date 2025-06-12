class pair {
    int first;
    int second;

    pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.second == a.second ? b.first - a.first : b.second - a.second);

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            pq.add(new pair(arr[i], diff));
            if (pq.size() > k) pq.poll();
        }

        List<pair> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        
        list.sort((a, b) ->  a.first - b.first );

        for (pair curr : list) {
            res.add(curr.first);
        }

        return res;
    }
}
