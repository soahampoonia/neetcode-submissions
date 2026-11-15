class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String x = new String(c);

            if (map.containsKey(x)) {
                map.get(x).add(str);
            } else {
                List<String> list = new ArrayList<>();
                map.put(x, list);
                map.get(x).add(str);
            }
        }
        
        List<List<String>> listy = new ArrayList<>(map.values()); 
        
        return listy;
    }
}
