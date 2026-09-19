 class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstPositive = firstPositive(nums);
        int firstNonNegative = firstNonNegative(nums);

        int positive = n - firstPositive;
        int negative = firstNonNegative;

        return Math.max(positive, negative);
    }

    private int firstPositive(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > 0)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        return lo;
    }

    private int firstNonNegative(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= 0)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        return lo;
    }
}