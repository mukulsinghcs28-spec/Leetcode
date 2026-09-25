class Solution {
    public int heightChecker(int[] heights) {

        int[] freq = new int[101];

        for (int h : heights) {
            freq[h]++;
        }

        int count = 0;
        int expected = 0;

        for (int i = 0; i < heights.length; i++) {

            while (freq[expected] == 0) {
                expected++;
            }

            if (heights[i] != expected) {
                count++;
            }

            freq[expected]--;
        }

        return count;
    }
}