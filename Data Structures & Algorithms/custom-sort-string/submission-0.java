class Solution {
    public String customSortString(String order, String s) {
        StringBuilder word = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            int count = map.getOrDefault(ch, 0);

            while (count > 0) {
                word.append(ch);
                count--;
            }
            map.remove(ch);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char cha = entry.getKey();
            int count = entry.getValue();

            while (count != 0) {
                word.append(cha);
                count--;
            }
        }

        return word.toString();
    }
}