class Solution {
    public int mySqrt(int n) {
       long lo = 0 , hi = n;
       while(lo<=hi){
        long mid = (hi+lo)/2;
        if(mid*mid == n){
            return (int) mid;
        } else if(mid*mid < n){
            lo = mid+1;
        } else{
            
            hi = mid-1;
        }
       }
       return(int) hi; 
    }
}