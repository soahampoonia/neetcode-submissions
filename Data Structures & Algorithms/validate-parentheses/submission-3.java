class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            if (s.charAt(i) == '{') {
                stack.push('{');
            }
            if (s.charAt(i) == '[') {
                stack.push('[');
            }

            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) return true;
        return false;
    }
}
