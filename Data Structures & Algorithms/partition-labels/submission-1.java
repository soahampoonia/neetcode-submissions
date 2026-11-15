class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {
            if (map.containsKey(s.charAt(i))) {
                int num = map.get(s.charAt(i));
                map.remove(s.charAt(i));
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        int left = 0;
        int right = 0;

        List<Integer> list = new ArrayList<>();
        int index = 0;

        while (index < s.length()) {
            right = Math.max(right, map.get(s.charAt(index)));
           
            if (index == right) {
                list.add(right - left + 1);
                left = right + 1;
            }
             index++;
        }
        return list;
    }    
}
