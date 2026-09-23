class Solution {
    public int compress(char[] chars) {

        int i = 0; 
        int j = 0; 
        int n = chars.length;

        while (j < n) {

            
            char c = chars[j];
            int count = 0;

            
            while (j < n && chars[j] == c) {
                j++;
                count++;
            }

            
            chars[i] = c;
            i++;

            
            if (count > 1) {

                String str = String.valueOf(count);

                for (int k = 0; k < str.length(); k++) {
                    chars[i] = str.charAt(k);
                    i++;
                }
            }
        }

        return i;
    }
}