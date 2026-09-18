class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstPositive = upperBound(nums, 0);
        int firstNonNegative = lowerBound(nums, 0);

        int positive = n - firstPositive;
        int negative = firstNonNegative;

        return Math.max(positive, negative);
    }

    // First element >= target
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    // First element > target
    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}