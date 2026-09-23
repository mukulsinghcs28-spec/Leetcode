class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        int first = -1;
        int second = -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                count++;

                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        if (count == 2) {
            return s.charAt(first) == goal.charAt(second)
                && s.charAt(second) == goal.charAt(first);
        }

        if (count == 0) {

            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;

                if (freq[s.charAt(i) - 'a'] >= 2) {
                    return true;
                }
            }
        }

        return false;
    }
}