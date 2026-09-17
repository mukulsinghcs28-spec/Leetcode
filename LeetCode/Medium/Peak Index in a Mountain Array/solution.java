class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int n = nums.length;
       int low = 0 , hi = n-1;
        while(low<hi){
            int mid = (low+hi)/2;
            if(nums[mid]<nums[mid+1]){
                low = mid+1;
            }else{
                hi = mid;
            }
        }
        return low;
    }
}