class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;

        double median = 0;
        
        int[] combine = new int[total];


        for (int i = 0; i < nums1.length; i++) {
            combine[i] = nums1[i];
        }
        for (int j = nums1.length; j < total; j++) {
            combine[j] = nums2[j-nums1.length];
        }

        Arrays.sort(combine);

        if (total % 2 == 0) {
            median = (combine[total/2 - 1] + combine[total/2]) / 2.0;
        }

        if (total % 2 == 1) {
            median = combine[total/2];
        }

        return median;
    }
}
