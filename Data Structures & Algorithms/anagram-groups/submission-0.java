class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       HashMap<String, List<String>> map = new HashMap<>();


       for (String str : strs) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String stringy = new String(ch);
       if (map.containsKey(stringy)) {
        map.get(stringy).add(str);
       } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(stringy, list);
       }
       
       }

       return new ArrayList<>(map.values()); 



    }
}
