class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = k - 1;
        int sum = 0;
        int fin = 0;
        int count = 0;

        for (int i = 0; i < right; i++) {
            sum += arr[i];
            count++;
        }

        while (right < arr.length) {
            sum += arr[right];
            double avg = sum / k;
            if (avg >= threshold) fin++;
            right++;
            sum-=arr[left];
            left++;
        }
        return fin;
    }
}