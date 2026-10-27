class Solution {
    Integer[] counts = new Integer[46];

    public Solution() {
        counts[0] = 0;
        counts[1] = 1;
        counts[2] = 2;
    }

    public int climbStairs(int n) {
        if (counts[n] != null) {
            return counts[n]; 
        }
        
        return counts[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }

    
}
