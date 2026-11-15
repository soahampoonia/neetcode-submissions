class Solution {
    public void sortColors(int[] nums) {
        
        int red = 0;
        int white = 0;
        int blue = 0;

        int counter = 0;

        while (counter < nums.length && red < nums.length && white < nums.length && blue < nums.length) {
            if (nums[counter] == 0) {
                red++;
            }
            if (nums[counter] == 1) {
                white++;
            }
            if (nums[counter] == 2) {
                blue++;
            }
            counter++;
        }

        int pass = 0;
        while (pass < red) {
            nums[pass] = 0;
            pass++;
        }
        while (pass < red + white) {
            nums[pass] = 1;
            pass++;
        }
        while (pass < red + white + blue) {
            nums[pass] = 2;
            pass++;
        }

    }
}