class Solution {
    public int appendCharacters(String s, String t) {
        StringBuilder st = new StringBuilder();


        Deque<Character> stack = new ArrayDeque<>();

        for (int i = t.length() - 1; i >= 0; i--) {
            stack.push(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (stack.size() != 0 && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
        }

        return stack.size();
    }
}