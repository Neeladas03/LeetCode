class Solution {
    public int mySqrt(int x) {
    if (x == 0) return 0;
    int low = 1, high = x;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        long m_squared = (long) mid * mid;
        if (m_squared == x) return mid;
        else if (m_squared < x) low = mid + 1;
        else high = mid - 1;
    }
    return high;
}
}