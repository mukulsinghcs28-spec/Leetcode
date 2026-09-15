class Solution {
    public int[] intersection(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int[] ans = new int[Math.min(a.length, b.length)];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {

                if (k == 0 || ans[k - 1] != a[i]) {
                    ans[k] = a[i];
                    k++;
                }

                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return Arrays.copyOf(ans, k);
    }
}