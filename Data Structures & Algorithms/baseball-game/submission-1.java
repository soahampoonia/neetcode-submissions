class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : operations) {
            int score = 0;
            if (str.equals("+")) {
                int one  = stack.pop();
                int two = stack.pop();
                score = one + two;
                stack.push(two);
                stack.push(one);
                stack.push(score);

            } else if (str.equals("D")) {
                score = stack.peek() * 2;
                stack.push(score);
            } else if (str.equals("C")) {
                stack.pop();
            } else {
                score = Integer.parseInt(str);
                stack.push(score);
            }
            
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

}

        