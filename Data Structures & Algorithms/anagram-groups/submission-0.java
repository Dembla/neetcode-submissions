class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> result = new ArrayList<List<String>>();
        result.addAll(map.values());
        // return new ArrayList<>(map.values());
        return result;
    }
}
