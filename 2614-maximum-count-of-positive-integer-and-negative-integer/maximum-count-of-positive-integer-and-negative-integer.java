 class Solution {
    public int maximumCount(int[] nums) {
        
        int n = nums.length;

        int negative = lowerBound(nums, 0);
        int positive = n - upperBound(nums, 0);

        return Math.max(negative, positive);
    }

    // First element >= 0
    private int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // First element > 0
    private int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}