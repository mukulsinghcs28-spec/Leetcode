class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int top = 0 ;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        int left =0;
        while(top<=bottom && left<=right){
            for(int j= left ; j <=right; j++){
                ans.add(arr[top][j]);
            }
            top++;
            for(int i = top ; i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j= right ; j >=left; j--){
                    ans.add(arr[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }

        
        }
        return ans;
    }
}