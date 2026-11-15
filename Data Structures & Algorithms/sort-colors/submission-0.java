class Solution {
    public void sortColors(int[] nums) {
        Deque<Integer> redstack = new ArrayDeque<>();
        Deque<Integer> whitestack = new ArrayDeque<>();
        Deque<Integer> bluestack = new ArrayDeque<>();

        for (int num : nums) {
            if (num == 0) redstack.push(num);
            if (num == 1) whitestack.push(num);
            if (num == 2) bluestack.push(num);
        }

        int counter = 0;

        while (!redstack.isEmpty()) {
            nums[counter] = redstack.pop();
            counter++;
        }
        while (!whitestack.isEmpty()) {
            nums[counter] = whitestack.pop();
            counter++;
        }
        while (!bluestack.isEmpty()) {
            nums[counter] = bluestack.pop();
            counter++;
        }
        

    }
}