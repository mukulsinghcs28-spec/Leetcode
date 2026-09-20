class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length , n = arr[0].length;
         int lo = 0;
        int hi = m*n-1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int row = mid / n;
            int col = mid % n;

            if (arr[row][col] == target) {
                return true;
            } 
            else if(arr[row][col] < target){
                lo = mid+1;
            } 
            else{
                hi = mid-1;
            }   
        }
        return false;
    }
}