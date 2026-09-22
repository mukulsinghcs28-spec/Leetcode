class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[]freq = new int[26];
        for(int i = 0 ; i <s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int max = 0;
        char ans = 'a';
        for(int i = 0 ; i <26;i++){
            if(freq[i]>max){
                max = freq[i];
                ans = (char)('a'+i);
            }
        }
        return ans;
    }
}