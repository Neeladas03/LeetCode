import java.util.PriorityQueue;

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        int count = 0, i = 0;
        int fuel = startFuel;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max heap for fuel

        while (fuel < target) {
            while (i < n && stations[i][0] <= fuel) { // Add reachable stations
                pq.offer(stations[i][1]);
                i++;
            }

            if (pq.isEmpty()) return -1; // No more reachable stations, can't reach target

            fuel += pq.poll(); // Refuel from the station with the max fuel
            count++;
        }

        return count;
    }
}
