class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int low= 0; int hi = arr.length-1;
       int ans = -1;
        while(low<=hi){
            int mid = low + (hi-low)/2;
            if(arr[mid]<=x){
                ans = mid;
                low = mid+1;
            }
           
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
}
