class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] arr = new int[26];
        int max = 0;


        for (char c : tasks) {
            arr[c-'A']++;
            
            if (arr[c-'A'] > max) max = Math.max(max, arr[c - 'A']);
            
        }
        int maxCount = 0;
            
            for (int count : arr) {
                if (count == max) {
                    maxCount++;
                }
            }
        int emptyChunks = max - 1;
int frameworkSize = emptyChunks * (n + 1) + maxCount;
        
    return Math.max(tasks.length, frameworkSize);


    }
}
