class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        int currentS = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentS++;
            }
            else {
                if (currentS > maxC) {
                    maxC = currentS;
                }
                currentS = 0;
            }
        }
        if (currentS > maxC) {
            maxC = currentS;
        }
        return maxC;
    }
}