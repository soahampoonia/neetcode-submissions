class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        Boolean uno = false;
        Boolean dos = false;
        Boolean tres = false;

        for (int i = 0; i < triplets.length; i++) {
            int balance = 0;
            int match = 0;
            for (int j = 0; j < 3; j++) {
                if (target[j] >= triplets[i][j]) balance++;
            }
            if (balance == 3) {
                if (triplets[i][0] == target[0]) uno = true;
                if (triplets[i][1] == target[1]) dos = true;
                if (triplets[i][2] == target[2]) tres = true;
                if (uno && dos && tres) return true;
            }
        }
        return false;
    }
}
