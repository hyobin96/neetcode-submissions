class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> countsMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            countsMap.put(c, countsMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int count = countsMap.getOrDefault(c, 0);
            if (count == 0) return false;
            countsMap.put(c, count - 1);
        }
        
        return true;
    }
}
