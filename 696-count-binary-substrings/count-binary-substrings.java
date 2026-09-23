class Solution {
    public int countBinarySubstrings(String s) {
        int prv =0;
        int curr=1;
        int ans=0;
        for(int i =1 ;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                ans += Math.min(prv, curr);
                prv = curr;
                curr = 1;
            }
        }
        ans += Math.min(prv, curr);

        return ans;
    }
}