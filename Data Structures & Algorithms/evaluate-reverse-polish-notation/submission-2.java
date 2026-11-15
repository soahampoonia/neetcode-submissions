class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left - right);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.pop();
    }
}