class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int ele : nums) {

            if (count == 0) {
                candidate = ele;
            }

            if (ele == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}