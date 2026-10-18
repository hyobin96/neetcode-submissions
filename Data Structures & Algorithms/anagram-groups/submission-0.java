class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);

            if (map.containsKey(sortedS)) {
                map.get(sortedS).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedS, list);
            }
        }

        List<List<String>> groups = new ArrayList<>();
        for (List<String> group : map.values()) {
            groups.add(group);
        }

        return groups;
    }
}
