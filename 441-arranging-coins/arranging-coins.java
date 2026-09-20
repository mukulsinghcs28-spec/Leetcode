class Solution {
    public int arrangeCoins(int n) {
        long lo = 0 ,  hi = n;
        while(lo<=hi){
            long mid = lo + (hi -lo )/2;
            long coin = mid * (mid+1)/2;
            if(coin<=n){
                lo=mid+1;
            }else{
                hi =mid-1;
            }
        }
        return (int)hi;
    }
}