class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();

        int[][] cars = new int[position.length][2];
for (int i = 0; i < position.length; i++) {
    cars[i][0] = position[i]; // Position
    cars[i][1] = speed[i];    // Speed
}

// Sort the cars based on position (index 0) in ascending order
Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = position.length - 1; i >= 0; i--) {
            
            double time = (double) (target - cars[i][0]) / cars[i][1];

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
